package org.kiev.ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringIgniteApp {

    public static void main(String[] args) {
        System.out.println("....................START");
        SpringApplication.run(SimpleSpringIgniteApp.class, args);
        System.out.println("....................END");
    }
}
