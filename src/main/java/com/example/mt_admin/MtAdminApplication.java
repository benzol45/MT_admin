package com.example.mt_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MtAdminApplication {

    //TODO Передавать все доступные непросроченные ЭЦП ещё что бы выбирать активную

    //TODO События: вывод их на экран, возможность скрывать.

    public static void main(String[] args) {
        SpringApplication.run(MtAdminApplication.class, args);
    }

}
