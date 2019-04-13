package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.RHdemandeRecrutementRepository;
import com.example.entities.RHdemandeRecrutement;

@RestController
@CrossOrigin("*")
public class RHdemandeRecrutementController {

	@Autowired
	private RHdemandeRecrutementRepository RHdemandeRecrutementRepository;

	@GetMapping(value="/RHdemandeRecrutements")

	public List<RHdemandeRecrutement> getRHdemandeRecrutements(){

		return RHdemandeRecrutementRepository.findAll();

	}

	@GetMapping(value="/RHdemandeRecrutement/{id}")

	public RHdemandeRecrutement getRHdemandeRecrutement(@PathVariable Long id){

		return RHdemandeRecrutementRepository.findById(id).get();

	}

	@PostMapping(value="/RHdemandeRecrutements")

	public RHdemandeRecrutement save(@RequestBody RHdemandeRecrutement RHdemandeRecrutement){

		return RHdemandeRecrutementRepository.save(RHdemandeRecrutement);

	}

	@DeleteMapping(value="/RHdemandeRecrutement/{id}")

	public void delete(@PathVariable Long id){

		RHdemandeRecrutementRepository.delete(RHdemandeRecrutementRepository.getOne(id));

	}


	@PutMapping(value="/RHdemandeRecrutement/{id}")

	public RHdemandeRecrutement edit(@PathVariable Long id, @RequestBody RHdemandeRecrutement RHdemandeRecrutement){

		RHdemandeRecrutement.setId(id);

		return RHdemandeRecrutementRepository.saveAndFlush(RHdemandeRecrutement);

	}

}

