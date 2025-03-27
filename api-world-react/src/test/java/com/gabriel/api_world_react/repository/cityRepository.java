package com.gabriel.api_world_react.repository;

import com.gabriel.api_world_react.entity.city;
import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface cityRepository extends JpaRepository<city, Long> {
    List<city> findByNameContainingIgnoreCase(String name);
}
