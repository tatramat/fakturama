package cz.fakturama.idoklad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @Autowired

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");

        LoginBean loginBean = applicationContext.getBean(LoginBean.class);
        loginBean.login();



    }

}
