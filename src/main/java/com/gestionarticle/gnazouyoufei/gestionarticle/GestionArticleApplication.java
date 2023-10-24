package com.gestionarticle.gnazouyoufei.gestionarticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class GestionArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionArticleApplication.class, args);
    }

}
