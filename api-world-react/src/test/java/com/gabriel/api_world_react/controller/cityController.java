package com.gabriel.api_world_react.controller;

import com.gabriel.api_world_react.entity.City;
import com.gabriel.api_world_react.service.cityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
@CrossOrigin(origins = "http://localhost:3000")

public class cityController {
    
    @Autowired
    private cityService service;

    @GetMapping
    public List<City> findAll() {
        System.out.println("🔴 [LOG] - Endpoint /api/city foi chamado!");
        return service.findAll();
    }

    @GetMapping("/name/{name}")
    public List<City> findByName(@PathVariable String name) {
        return service.findByName(name);
    }

}
