package com.example.demo.repositories;

import com.example.demo.models.Category;
import com.example.demo.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KompisRepository extends CrudRepository<Kompis, Long> {

    Kompis findByName(String name);
    List<Kompis> findByEmail(String email);
    List<Kompis> findByPhonenr(String phonenr);
}
