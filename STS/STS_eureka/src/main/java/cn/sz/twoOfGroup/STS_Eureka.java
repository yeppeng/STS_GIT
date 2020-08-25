package cn.sz.twoOfGroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class STS_Eureka {
    public static void main(String[] args) {
        SpringApplication.run(STS_Eureka.class,args);
    }
}
