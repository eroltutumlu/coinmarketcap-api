package com.coin.cryptocurrency.config;

import com.coin.cryptocurrency.interceptor.RestTemplateInterceptor;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
@AllArgsConstructor
public class RestTemplateConfig {

    private final RestTemplateBuilder builder;

    @Bean
    public RestTemplate coinMarketCapRestTemplate() {

        return builder
                .setConnectTimeout(Duration.ofMillis(3000))
                .setReadTimeout(Duration.ofMillis(3000))
                .interceptors(new RestTemplateInterceptor())
                .build();
    }

}
