package com.example.demo.repository;

import com.example.demo.model.Mcase;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McaseRepository extends CrudRepository<Mcase,Long> {
    
}
