package com.casit.dmu_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//开启swagger
@EnableSwagger2
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
