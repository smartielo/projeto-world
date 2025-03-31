package com.gabriel.api_world_react.service;

import com.gabriel.api_world_react.entity.City;
import com.gabriel.api_world_react.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class cityService {
    
    @Autowired
    private CityRepository repository;

    public List<City> findAll() {
        return repository.findAll();
    }

    public List<City> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

}
