package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Modification;
import com.example.entities.Validation;

public interface ValidationRepository extends JpaRepository<Validation, Long> {

}
