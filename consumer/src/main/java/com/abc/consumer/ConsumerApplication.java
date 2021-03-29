package com.abc.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.abc")
@EnableDubbo(scanBasePackages = "com.abc")
@ImportResource({"classpath*:consumer.xml"})
public class ConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class)
                .build()
                .run(args);
    }

}
