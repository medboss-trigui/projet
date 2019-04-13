package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Modification;

public interface ModificationRepository extends JpaRepository<Modification, Long> {

}
