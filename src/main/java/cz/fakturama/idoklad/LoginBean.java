package cz.fakturama.idoklad;

import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by tatramat911 on 11.10.16.
 */
@Component
public class LoginBean {

    @Value("${user.login}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Autowired
    RequestBean requester;

    public void login() {

        HttpGet request = requester.getRequestGet(String.format("Agendas/GetSecureToken?username=%s&password=%s", username, password));
        InputStream is = requester.executeRequest(request);
        if (is == null) {
            throw new RuntimeException("login failed");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder result = new StringBuilder();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                    result.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (result != null && result.toString().trim().length() > 0) {
            requester.setAuthToken(result.toString().replaceAll("\"", ""));
        }
    }

}
