package me.sathish.trackstrava;

import me.sathish.trackstrava.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class StravaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StravaApplication.class, args);
    }
}