package com.valletta.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan("com.valletta.modulecommon")
@SpringBootApplication(
    scanBasePackages = {"com.valletta.moduleapi", "com.valletta.modulecommon"}
)
@EntityScan("com.valletta.modulecommon.domain")
@EnableJpaRepositories(basePackages = "com.valletta.modulecommon.repository")
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
