package cz.fakturama.idoklad;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tatramat911 on 11.10.16.
 */
@Component
public class RequestBean {

    public static final String APP_NAME = "idoklad-tools";
    public static final String APP_VERSION = "0.0.1";

    @Value("${server.url}")
    private String url;

    private String authToken = null;

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public HttpGet getRequestGet(String endpoint) {
        HttpGet request = new HttpGet(url + endpoint);
        request.addHeader("X-App", APP_NAME);
        request.addHeader("X-App-Version", APP_VERSION);
        return request;
    }

    public InputStream executeRequest(HttpUriRequest request) {
        HttpClient client = HttpClientBuilder.create().build();

        try {
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            return response.getEntity().getContent();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
