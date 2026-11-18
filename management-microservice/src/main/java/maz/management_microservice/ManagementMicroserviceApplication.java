package maz.management_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //the server keeps track of what clients are active and available and where they exist.
public class ManagementMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementMicroserviceApplication.class, args);
    }
}

