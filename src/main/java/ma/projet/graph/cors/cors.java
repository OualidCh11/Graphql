package ma.projet.graph.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class cors implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/graphql") // Allow CORS for GraphQL endpoint
                .allowedOrigins("http://localhost:3000") // Allow frontend on localhost:3000
                .allowedMethods("GET", "POST") // Allow GET and POST methods
                .allowedHeaders("*"); // Allow all headers
    }
}   
