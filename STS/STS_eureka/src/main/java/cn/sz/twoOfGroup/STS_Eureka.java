package cn.sz.twoOfGroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("cn.sz.twoOfGroup.config")
public class STS_Eureka {
    public static void main(String[] args) {
        SpringApplication.run(STS_Eureka.class,args);
    }
}
