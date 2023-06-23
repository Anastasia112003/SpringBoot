package ru.netology.springbootconditionalapp.config;

import ru.netology.springbootconditionalapp.profile.DevProfile;
import ru.netology.springbootconditionalapp.profile.ProductionProfile;
import ru.netology.springbootconditionalapp.profile.SystemProfile;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
        @Bean
        @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
        public SystemProfile devProfile () {
            return new DevProfile();
        }

        @Bean
        @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
        public SystemProfile prodProfile () {
            return new ProductionProfile();
        }
    }
