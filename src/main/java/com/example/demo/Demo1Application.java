package com.example.demo;

import com.example.demo.models.Category;
import com.example.demo.models.Kompis;
import com.example.demo.models.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.KompisRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@SpringBootApplication
public class Demo1Application {

    @Autowired
    private KompisRepository kompisRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
/*
    @Bean
    public CommandLineRunner demo (KompisRepository kompisRepository) {
        return (args -> {

            categoryRepository.save(new Category("Mejeri"));
            categoryRepository.save(new Category("Frukt"));
          //  kompisRepository.save(new Kompis("Matte","matte@gmail","03456456"));
           // kompisRepository.save(new Kompis("Jere","Jere@gmail","031231236"));

            for (Kompis k: kompisRepository.findAll()){
                System.out.println(k.toString());
            }
            System.out.println("ForEach lambda");
            List<Kompis> list = (List<Kompis>) kompisRepository.findAll();
            list.forEach(kompis -> System.out.println(kompis.toString()));

            System.out.println("by name: ");
            Kompis kompis = kompisRepository.findByName("Pavel");
            System.out.println(kompis.toString());
        });
    }*/

    /*

    @Bean
    InitializingBean sendDatabase() {
        return () -> {
           final String x = "INSERT INTO product (title, description, image, price, category_id) VALUES ('Tomater','Runda och fina tomater. Skölj och ha i salladen eller på smörgåsen. Observera att ursprungsland för denna produkt kan variera beroende på säsong och tillgång.','/images/fruit/tomatoes-1238255_640.jpg',39.9,1)";
       // @Query(x)
            //      productRepository.save(new Product("Runda och fina tomater. Skölj och ha i salladen eller på smörgåsen. Observera att ursprungsland för denna produkt kan variera beroende på säsong och tillgång.", "/images/fruit/tomatoes-1238255_640.jpg",39.90,1))
          //  categoryRepository.save(new Category( "Mejeri"));
        //    @Query(value = "1,'Tomater','Runda och fina tomater. Skölj och ha i salladen eller på smörgåsen. Observera att ursprungsland för denna produkt kan variera beroende på säsong och tillgång.','/images/fruit/tomatoes-1238255_640.jpg',39.9,1")
        };

    } */


}
