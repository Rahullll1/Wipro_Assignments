package com.example.healthcare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.healthcare.service.AppointmentService;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/healthcare/config/AppConfig.xml");

        AppointmentService service = (AppointmentService) context.getBean("appointmentService");

        String result = service.book("DOC101", "2025-04-10");
        System.out.println(result);

        String result2 = service.book("DOC101", "2025-04-12");
        System.out.println(result2);
    }
}
