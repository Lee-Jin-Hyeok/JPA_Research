package com.dsm.jpa.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/jpa_test?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1111";

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(DRIVER_CLASS_NAME)
                .url(URL)
                .username(USERNAME)
                .password(PASSWORD)
                .build();
    }
}
