package com.exhibition.onlineexhibition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.onlineexhibition.backend.models")
public class OnlineExhibitionApplication {

    public static void main(String[] args) {

        SpringApplication.run(OnlineExhibitionApplication.class, args);
    }

}
