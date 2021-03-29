package com.abc.searcher;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.abc")
@EnableDubbo(scanBasePackages = "com.abc")
@ImportResource({"classpath*:provider.xml"})
public class ProviderApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext app = new SpringApplicationBuilder(ProviderApplication.class)
                .build()
                .run(args);
    }

}
