package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.models.Product;
import com.example.demo.repositories.KompisRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// @RequestMapping(path = "/
@Controller
@CrossOrigin
public class KompisController {

    @Autowired
    private KompisRepository kompisRepository;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewKompis(@RequestParam String name, @RequestParam String email, @RequestParam String phonenr) {

        Kompis k = new Kompis();
        k.setName(name);
        k.setEmail(email);
        k.setPhonenr(phonenr);
        kompisRepository.save(k);
        return "Ny kompis sparad";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping(path="/allk")
    public @ResponseBody Iterable<Kompis> getAllKompisar(){
        return kompisRepository.findAll();
    }
}
