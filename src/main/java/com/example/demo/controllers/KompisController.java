package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class KompisController {

    @Autowired
    private KompisRepository kompisRepository;

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
    public @ResponseBody Iterable<Kompis> getAllKompisar(){
        return kompisRepository.findAll();
    }
}
