package com.mestaoui.datashowmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.mestaoui.datashowmicroservice.service")
public class DataShowMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataShowMicroserviceApplication.class, args);
    }

}
