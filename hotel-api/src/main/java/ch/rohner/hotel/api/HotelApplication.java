package ch.rohner.hotel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"ch.rohner.hotel.persistence.repos"})
@EntityScan(basePackages = {"ch.rohner.hotel.domain.models"})
@ComponentScan(basePackages = {"ch.rohner.hotel"})
public class HotelApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class);
    }
}
