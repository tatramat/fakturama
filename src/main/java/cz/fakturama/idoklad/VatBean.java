package cz.fakturama.idoklad;

import cz.fakturama.idoklad.model.Invoice;
import cz.fakturama.idoklad.model.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by tatramat911 on 12.10.16.
 */
@Component
public class VatBean {

    @Value("${vat.eligibility.months}")
    private int vatMonths;

    @Value("${vat.eligibility.amount}")
    private double vatAmount;

    public void process(Response response) {
        Map<String, List<Invoice>> sortedByMonths = new TreeMap<>();
        for (Invoice inv : response.getData()) {
            String key = getInvoiceYearMonth(inv);
            if (!sortedByMonths.containsKey(key)) {
                sortedByMonths.put(key, new ArrayList<>());
            }
            sortedByMonths.get(key).add(inv);
        }

        countVat(sortedByMonths);
    }

    private String getInvoiceYearMonth(Invoice inv) {
        DateFormat df = new SimpleDateFormat("yyyy-MM");
        return df.format(inv.getDateOfPayment());
    }

    private void countVat(Map<String, List<Invoice>> sortedByMonth) {
        if (sortedByMonth.isEmpty()) {
            return;
        }
        List<String> keysList = new ArrayList<>(sortedByMonth.keySet());
        ListIterator<String> iter = keysList.listIterator(keysList.size());
        int count = 0;
        double total = 0d;
        while (iter.hasPrevious() && count < vatMonths) {
            String key = iter.previous();
            for (Invoice inv : sortedByMonth.get(key)) {
                total += inv.getTotalWithVat();
            }
            count++;
        }
        System.out.println("price for VAT: " + total);
        System.out.println("eligible for vat: " + (total > vatAmount));
    }

}
