package com.polarbookshop.orderService.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "polar")
public record ClientProperties(
        @NotNull
        URI catalogsServiceUri
) {
}
