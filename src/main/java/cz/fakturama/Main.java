package cz.fakturama;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        FakturamaService service = applicationContext.getBean(FakturamaService.class);
        service.process();

    }





}
