package com.example.demo;

import com.example.demo.models.Category;
import com.example.demo.models.Kompis;
import com.example.demo.repositories.CategoryRepository;
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
    @Autowired
    private CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }


    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            categoryRepository.save(new Category( "Mejeri"));

        };
    }


}
