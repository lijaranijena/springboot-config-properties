package com.scp.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "person-details")
@Getter
@Setter
public class PersonDetailsConfig {
    private String firstName;
    private String lastName;
    private int age;
    private String place;
}
