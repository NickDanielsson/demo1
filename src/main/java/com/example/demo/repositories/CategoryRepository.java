package com.example.demo.repositories;

import com.example.demo.models.Category;
import com.example.demo.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}