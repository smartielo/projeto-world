package com.gabriel.api_world_react.service;

import com.gabriel.api_world_react.entity.city;
import com.gabriel.api_world_react.repository.cityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class cityService {
    
    @Autowired
    private cityRepository repository;

    public List<city> findAll() {
        return repository.findAll();
    }

    public List<city> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

}
