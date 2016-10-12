package cz.fakturama;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cz.fakturama.idoklad.LoginBean;
import cz.fakturama.idoklad.RequestBean;
import cz.fakturama.idoklad.VatBean;
import cz.fakturama.idoklad.model.Response;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by tatramat911 on 12.10.16.
 */
@Service
public class FakturamaService {

    @Autowired
    private LoginBean loginBean;

    @Autowired
    private RequestBean requestBean;

    @Autowired
    private VatBean vatBean;

    public void process() {
        loginBean.login();

        HttpGet invoicesReq = requestBean.getRequestGet("IssuedInvoices");

        InputStream is = requestBean.executeRequest(invoicesReq);
        if (is != null) {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            Response response = gson.fromJson(new InputStreamReader(is), Response.class);

            vatBean.process(response);

            System.out.println("here we go");
        }
    }

}
