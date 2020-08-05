package com.yilutong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class H5TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(H5TestApplication.class, args);
    }

}
