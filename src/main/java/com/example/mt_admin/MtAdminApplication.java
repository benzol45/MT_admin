package com.example.mt_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MtAdminApplication {

    //TODO забирание настроек с гейтвея, показ их в виде формы и отправка новых на гейтвей. Передавать все доступные непросроченные ЭЦП ещё что бы выбирать активную

    //TODO рест-контроллер для получения сообшений, вывод их на экран, возможность скрывать.

    public static void main(String[] args) {
        SpringApplication.run(MtAdminApplication.class, args);
    }

}
