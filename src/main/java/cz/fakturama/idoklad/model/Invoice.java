package cz.fakturama.idoklad.model;

import java.util.Date;
import java.util.Map;

/**
 * Created by tatramat911 on 12.10.16.
 */
public class Invoice {

    private IssuedInvoiceItem[] IssuedInvoiceItems;
    private double BaseTaxBasicRate;
    private double BaseTaxBasicRateHc;
    private double BaseTaxReducedRate1;
    private double BaseTaxReducedRate1Hc;
    private double BaseTaxReducedRate2;
    private double BaseTaxReducedRate2Hc;
    private double BaseTaxZeroRate;
    private double BaseTaxZeroRateHc;
    private int ConstantSymbolId;
    private int CurrencyId;
    private Date DateLastChange;
    private Date DateOfAccountingEvent;
    private Date DateOfIssue;
    private Date DateOfLastReminder;
    private Date DateOfMaturity;
    private Date DateOfPayment;
    private Date DateOfTaxing;
    private String Description;
    private String DocumentNumber;
    private int DocumentSerialNumber;
    private double ExchangeRate;
    private double ExchangeRateAmount;
    private int Exported;
    private boolean IsSentToAccountant;
    private boolean IsSentToPurchaser;
    private String ItemsTextPrefix;
    private String ItemsTextSuffix;
    private int LanguageId;
    private int Maturity;
    private int MyCompanyDocumentAdrressId;
    private String Note;
    private String OrderNumber;
    private int PaymentOptionId;
    private int PaymentStatus;
    private int PurchaserDocumentAddressId;
    private int PurchaserId;
    private int RemindersCount;
    private String ReportColorValue;
    private int ReportId;
    private double RoundingDifference;
    private double TaxBasicRate;
    private double TaxBasicRateHc;
    private double TaxReducedRate1;
    private double TaxReducedRate1Hc;
    private double TaxReducedRate2;
    private double TaxReducedRate2Hc;
    private double TotalBasicRate;
    private double TotalBasicRateHc;
    private double TotalReducedRate1;
    private double TotalReducedRate1Hc;
    private double TotalReducedRate2;
    private double TotalReducedRate2Hc;
    private double TotalVat;
    private double TotalVatHc;
    private double TotalWithVat;
    private double TotalWithVatHc;
    private double TotalWithoutVat;
    private double TotalWithoutVatHc;
    private double Discount;
    private String VariableSymbol;
    private double VatRateBasic;
    private double VatRateReduced1;
    private double VatRateReduced2;
    private int VatOnPayStatus;
    private Date DateOfVatApplication;
    private int Id;
    private Map<String, String> Links;

    public IssuedInvoiceItem[] getIssuedInvoiceItems() {
        return IssuedInvoiceItems;
    }

    public void setIssuedInvoiceItems(IssuedInvoiceItem[] issuedInvoiceItems) {
        IssuedInvoiceItems = issuedInvoiceItems;
    }

    public double getBaseTaxBasicRate() {
        return BaseTaxBasicRate;
    }

    public void setBaseTaxBasicRate(double baseTaxBasicRate) {
        BaseTaxBasicRate = baseTaxBasicRate;
    }

    public double getBaseTaxBasicRateHc() {
        return BaseTaxBasicRateHc;
    }

    public void setBaseTaxBasicRateHc(double baseTaxBasicRateHc) {
        BaseTaxBasicRateHc = baseTaxBasicRateHc;
    }

    public double getBaseTaxReducedRate1() {
        return BaseTaxReducedRate1;
    }

    public void setBaseTaxReducedRate1(double baseTaxReducedRate1) {
        BaseTaxReducedRate1 = baseTaxReducedRate1;
    }

    public double getBaseTaxReducedRate1Hc() {
        return BaseTaxReducedRate1Hc;
    }

    public void setBaseTaxReducedRate1Hc(double baseTaxReducedRate1Hc) {
        BaseTaxReducedRate1Hc = baseTaxReducedRate1Hc;
    }

    public double getBaseTaxReducedRate2() {
        return BaseTaxReducedRate2;
    }

    public void setBaseTaxReducedRate2(double baseTaxReducedRate2) {
        BaseTaxReducedRate2 = baseTaxReducedRate2;
    }

    public double getBaseTaxReducedRate2Hc() {
        return BaseTaxReducedRate2Hc;
    }

    public void setBaseTaxReducedRate2Hc(double baseTaxReducedRate2Hc) {
        BaseTaxReducedRate2Hc = baseTaxReducedRate2Hc;
    }

    public double getBaseTaxZeroRate() {
        return BaseTaxZeroRate;
    }

    public void setBaseTaxZeroRate(double baseTaxZeroRate) {
        BaseTaxZeroRate = baseTaxZeroRate;
    }

    public double getBaseTaxZeroRateHc() {
        return BaseTaxZeroRateHc;
    }

    public void setBaseTaxZeroRateHc(double baseTaxZeroRateHc) {
        BaseTaxZeroRateHc = baseTaxZeroRateHc;
    }

    public int getConstantSymbolId() {
        return ConstantSymbolId;
    }

    public void setConstantSymbolId(int constantSymbolId) {
        ConstantSymbolId = constantSymbolId;
    }

    public int getCurrencyId() {
        return CurrencyId;
    }

    public void setCurrencyId(int currencyId) {
        CurrencyId = currencyId;
    }

    public Date getDateLastChange() {
        return DateLastChange;
    }

    public void setDateLastChange(Date dateLastChange) {
        DateLastChange = dateLastChange;
    }

    public Date getDateOfAccountingEvent() {
        return DateOfAccountingEvent;
    }

    public void setDateOfAccountingEvent(Date dateOfAccountingEvent) {
        DateOfAccountingEvent = dateOfAccountingEvent;
    }

    public Date getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        DateOfIssue = dateOfIssue;
    }

    public Date getDateOfLastReminder() {
        return DateOfLastReminder;
    }

    public void setDateOfLastReminder(Date dateOfLastReminder) {
        DateOfLastReminder = dateOfLastReminder;
    }

    public Date getDateOfMaturity() {
        return DateOfMaturity;
    }

    public void setDateOfMaturity(Date dateOfMaturity) {
        DateOfMaturity = dateOfMaturity;
    }

    public Date getDateOfPayment() {
        return DateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        DateOfPayment = dateOfPayment;
    }

    public Date getDateOfTaxing() {
        return DateOfTaxing;
    }

    public void setDateOfTaxing(Date dateOfTaxing) {
        DateOfTaxing = dateOfTaxing;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDocumentNumber() {
        return DocumentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        DocumentNumber = documentNumber;
    }

    public int getDocumentSerialNumber() {
        return DocumentSerialNumber;
    }

    public void setDocumentSerialNumber(int documentSerialNumber) {
        DocumentSerialNumber = documentSerialNumber;
    }

    public double getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        ExchangeRate = exchangeRate;
    }

    public double getExchangeRateAmount() {
        return ExchangeRateAmount;
    }

    public void setExchangeRateAmount(double exchangeRateAmount) {
        ExchangeRateAmount = exchangeRateAmount;
    }

    public int getExported() {
        return Exported;
    }

    public void setExported(int exported) {
        Exported = exported;
    }

    public boolean isSentToAccountant() {
        return IsSentToAccountant;
    }

    public void setSentToAccountant(boolean sentToAccountant) {
        IsSentToAccountant = sentToAccountant;
    }

    public boolean isSentToPurchaser() {
        return IsSentToPurchaser;
    }

    public void setSentToPurchaser(boolean sentToPurchaser) {
        IsSentToPurchaser = sentToPurchaser;
    }

    public String getItemsTextPrefix() {
        return ItemsTextPrefix;
    }

    public void setItemsTextPrefix(String itemsTextPrefix) {
        ItemsTextPrefix = itemsTextPrefix;
    }

    public String getItemsTextSuffix() {
        return ItemsTextSuffix;
    }

    public void setItemsTextSuffix(String itemsTextSuffix) {
        ItemsTextSuffix = itemsTextSuffix;
    }

    public int getLanguageId() {
        return LanguageId;
    }

    public void setLanguageId(int languageId) {
        LanguageId = languageId;
    }

    public int getMaturity() {
        return Maturity;
    }

    public void setMaturity(int maturity) {
        Maturity = maturity;
    }

    public int getMyCompanyDocumentAdrressId() {
        return MyCompanyDocumentAdrressId;
    }

    public void setMyCompanyDocumentAdrressId(int myCompanyDocumentAdrressId) {
        MyCompanyDocumentAdrressId = myCompanyDocumentAdrressId;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public int getPaymentOptionId() {
        return PaymentOptionId;
    }

    public void setPaymentOptionId(int paymentOptionId) {
        PaymentOptionId = paymentOptionId;
    }

    public int getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public int getPurchaserDocumentAddressId() {
        return PurchaserDocumentAddressId;
    }

    public void setPurchaserDocumentAddressId(int purchaserDocumentAddressId) {
        PurchaserDocumentAddressId = purchaserDocumentAddressId;
    }

    public int getPurchaserId() {
        return PurchaserId;
    }

    public void setPurchaserId(int purchaserId) {
        PurchaserId = purchaserId;
    }

    public int getRemindersCount() {
        return RemindersCount;
    }

    public void setRemindersCount(int remindersCount) {
        RemindersCount = remindersCount;
    }

    public String getReportColorValue() {
        return ReportColorValue;
    }

    public void setReportColorValue(String reportColorValue) {
        ReportColorValue = reportColorValue;
    }

    public int getReportId() {
        return ReportId;
    }

    public void setReportId(int reportId) {
        ReportId = reportId;
    }

    public double getRoundingDifference() {
        return RoundingDifference;
    }

    public void setRoundingDifference(double roundingDifference) {
        RoundingDifference = roundingDifference;
    }

    public double getTaxBasicRate() {
        return TaxBasicRate;
    }

    public void setTaxBasicRate(double taxBasicRate) {
        TaxBasicRate = taxBasicRate;
    }

    public double getTaxBasicRateHc() {
        return TaxBasicRateHc;
    }

    public void setTaxBasicRateHc(double taxBasicRateHc) {
        TaxBasicRateHc = taxBasicRateHc;
    }

    public double getTaxReducedRate1() {
        return TaxReducedRate1;
    }

    public void setTaxReducedRate1(double taxReducedRate1) {
        TaxReducedRate1 = taxReducedRate1;
    }

    public double getTaxReducedRate1Hc() {
        return TaxReducedRate1Hc;
    }

    public void setTaxReducedRate1Hc(double taxReducedRate1Hc) {
        TaxReducedRate1Hc = taxReducedRate1Hc;
    }

    public double getTaxReducedRate2() {
        return TaxReducedRate2;
    }

    public void setTaxReducedRate2(double taxReducedRate2) {
        TaxReducedRate2 = taxReducedRate2;
    }

    public double getTaxReducedRate2Hc() {
        return TaxReducedRate2Hc;
    }

    public void setTaxReducedRate2Hc(double taxReducedRate2Hc) {
        TaxReducedRate2Hc = taxReducedRate2Hc;
    }

    public double getTotalBasicRate() {
        return TotalBasicRate;
    }

    public void setTotalBasicRate(double totalBasicRate) {
        TotalBasicRate = totalBasicRate;
    }

    public double getTotalBasicRateHc() {
        return TotalBasicRateHc;
    }

    public void setTotalBasicRateHc(double totalBasicRateHc) {
        TotalBasicRateHc = totalBasicRateHc;
    }

    public double getTotalReducedRate1() {
        return TotalReducedRate1;
    }

    public void setTotalReducedRate1(double totalReducedRate1) {
        TotalReducedRate1 = totalReducedRate1;
    }

    public double getTotalReducedRate1Hc() {
        return TotalReducedRate1Hc;
    }

    public void setTotalReducedRate1Hc(double totalReducedRate1Hc) {
        TotalReducedRate1Hc = totalReducedRate1Hc;
    }

    public double getTotalReducedRate2() {
        return TotalReducedRate2;
    }

    public void setTotalReducedRate2(double totalReducedRate2) {
        TotalReducedRate2 = totalReducedRate2;
    }

    public double getTotalReducedRate2Hc() {
        return TotalReducedRate2Hc;
    }

    public void setTotalReducedRate2Hc(double totalReducedRate2Hc) {
        TotalReducedRate2Hc = totalReducedRate2Hc;
    }

    public double getTotalVat() {
        return TotalVat;
    }

    public void setTotalVat(double totalVat) {
        TotalVat = totalVat;
    }

    public double getTotalVatHc() {
        return TotalVatHc;
    }

    public void setTotalVatHc(double totalVatHc) {
        TotalVatHc = totalVatHc;
    }

    public double getTotalWithVat() {
        return TotalWithVat;
    }

    public void setTotalWithVat(double totalWithVat) {
        TotalWithVat = totalWithVat;
    }

    public double getTotalWithVatHc() {
        return TotalWithVatHc;
    }

    public void setTotalWithVatHc(double totalWithVatHc) {
        TotalWithVatHc = totalWithVatHc;
    }

    public double getTotalWithoutVat() {
        return TotalWithoutVat;
    }

    public void setTotalWithoutVat(double totalWithoutVat) {
        TotalWithoutVat = totalWithoutVat;
    }

    public double getTotalWithoutVatHc() {
        return TotalWithoutVatHc;
    }

    public void setTotalWithoutVatHc(double totalWithoutVatHc) {
        TotalWithoutVatHc = totalWithoutVatHc;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    public String getVariableSymbol() {
        return VariableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        VariableSymbol = variableSymbol;
    }

    public double getVatRateBasic() {
        return VatRateBasic;
    }

    public void setVatRateBasic(double vatRateBasic) {
        VatRateBasic = vatRateBasic;
    }

    public double getVatRateReduced1() {
        return VatRateReduced1;
    }

    public void setVatRateReduced1(double vatRateReduced1) {
        VatRateReduced1 = vatRateReduced1;
    }

    public double getVatRateReduced2() {
        return VatRateReduced2;
    }

    public void setVatRateReduced2(double vatRateReduced2) {
        VatRateReduced2 = vatRateReduced2;
    }

    public int getVatOnPayStatus() {
        return VatOnPayStatus;
    }

    public void setVatOnPayStatus(int vatOnPayStatus) {
        VatOnPayStatus = vatOnPayStatus;
    }

    public Date getDateOfVatApplication() {
        return DateOfVatApplication;
    }

    public void setDateOfVatApplication(Date dateOfVatApplication) {
        DateOfVatApplication = dateOfVatApplication;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Map<String, String> getLinks() {
        return Links;
    }

    public void setLinks(Map<String, String> links) {
        Links = links;
    }
}