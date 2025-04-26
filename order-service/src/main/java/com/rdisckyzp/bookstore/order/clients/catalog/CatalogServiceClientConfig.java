package com.rdisckyzp.bookstore.order.clients.catalog;

import com.rdisckyzp.bookstore.order.ApplicationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
class CatalogServiceClientConfig {
    @Bean
    RestClient restClient(ApplicationProperties properties) {
        return RestClient.builder().baseUrl(properties.catalogServiceUrl()).build();
    }
}
