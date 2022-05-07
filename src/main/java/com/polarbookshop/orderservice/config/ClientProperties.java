package com.polarbookshop.orderservice.config;

import java.net.URI;
import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClientProperties
 *
 * @author Kevin Hagel
 * @since 2022-05-07
 */
@ConfigurationProperties(prefix = "polar")
public record ClientProperties(
  @NotNull
  URI catalogServiceUri
) {}