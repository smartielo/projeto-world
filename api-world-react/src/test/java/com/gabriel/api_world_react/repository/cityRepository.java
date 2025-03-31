package com.gabriel.api_world_react.repository;

import com.gabriel.api_world_react.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findByNameContainingIgnoreCase(String name);
}
