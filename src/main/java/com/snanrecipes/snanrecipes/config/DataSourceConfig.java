//package com.snanrecipes.snanrecipes.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
//import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
//
//import javax.sql.DataSource;
//
///**
// * Only initialize in non-local environments
// * Local will be initialized automatically by Spring
// */
////@Profile("!local & !test")
//@Configuration
//@RequiredArgsConstructor
//public class DataSourceConfig {
//
//    @Bean
//    @FlywayDataSource
//    DataSource flywayDataSource(FlywayProperties flywayProperties, DataSourceProperties dataSourceProperties) {
//        return getDataSource(flywayProperties.getUser(), flywayProperties.getPassword(), dataSourceProperties.getUrl());
//    }
//
//    @Bean
//    @Primary
//    DataSource dataSource(DataSourceProperties dataSourceProperties) {
//        return getDataSource(dataSourceProperties.getUsername(), dataSourceProperties.getPassword(), dataSourceProperties.getUrl());
//    }
//
//    private DataSource getDataSource(String username, String clientId, String url) {
//        return DataSourceBuilder.create()
//                .url(url)
//                .username(username)
//                .password(accessTokenProvider.getManagedIdentityToken(clientId))
//                .build();
//    }
//}
