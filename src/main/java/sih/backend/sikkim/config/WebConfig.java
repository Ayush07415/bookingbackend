package sih.backend.sikkim.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configures CORS for the application.
 *
 * Supported properties:
 * - sikkim.cors.allowed-origins (e.g. http://localhost:5500)
 * Can accept a comma-separated list (e.g. http://localhost:5500,http://127.0.0.1:5500)
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${sikkim.cors.allowed-origins}")
    private String[] allowedOrigins;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(allowedOrigins)
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600); // Cache preflight requests for 1 hour
    }
}
