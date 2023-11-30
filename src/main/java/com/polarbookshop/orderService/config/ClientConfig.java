package com.polarbookshop.orderService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig {

    @Bean
    WebClient webClient(ClientProperties clientProperties, WebClient.Builder webclientBuilder){
        var base = "http://localhost:9001";
        return webclientBuilder
                .baseUrl(base)
                .build();
    }
}
