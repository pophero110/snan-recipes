package com.snanrecipes.snanrecipes.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        if (true) {
            return httpSecurity.csrf(AbstractHttpConfigurer::disable).build();
        }
        return httpSecurity.csrf(AbstractHttpConfigurer::disable)
                .cors(cors -> cors.configure(httpSecurity))
                .authorizeHttpRequests(customizer ->
                        customizer.requestMatchers("/actuator/health")
                                .permitAll().anyRequest()
                                .authenticated()).build();
    }
}
