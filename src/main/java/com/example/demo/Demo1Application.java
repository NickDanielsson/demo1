package com.example.demo;

import com.example.demo.models.Kompis;
import com.example.demo.repositories.KompisRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

    @Autowired
    private KompisRepository kompisRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            kompisRepository.save(new Kompis("John","@Rambo","123"));
            kompisRepository.save(new Kompis("Fredrik","@Reinfeldt","123234"));
            kompisRepository.save(new Kompis("Rebellen","@Almgren","123234"));
        };
    }
}
