package example.hg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ResourceServerConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.securityMatcher("/articles/**")
            .authorizeHttpRequests(authorize -> authorize.anyRequest()
                .hasAuthority("SCOPE_articles.read"))
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())); // ??jwt bearerToken으로 요청을 검사하겠다 라는 의미?
        return http.build();
    }
}
