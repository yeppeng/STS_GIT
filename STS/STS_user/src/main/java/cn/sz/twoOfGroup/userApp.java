package cn.sz.twoOfGroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class userApp {
    public static void main(String[] args) {
        SpringApplication.run(userApp.class,args);
    }
}
