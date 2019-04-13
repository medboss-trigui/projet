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

import com.example.dao.RHcongeRepository;
import com.example.entities.RHconge;

@RestController
@CrossOrigin("*")
public class RHcongeController {

	@Autowired
	private RHcongeRepository RHcongeRepository;

	@GetMapping(value="/RHconges")

	public List<RHconge> getRHconges(){

		return RHcongeRepository.findAll();

	}

	@GetMapping(value="/RHconge/{id}")

	public RHconge getRHconge(@PathVariable Long id){

		return RHcongeRepository.findById(id).get();

	}

	@PostMapping(value="/RHconges")

	public RHconge save(@RequestBody RHconge RHconge){

		return RHcongeRepository.save(RHconge);

	}

	@DeleteMapping(value="/RHconge/{id}")

	public void delete(@PathVariable Long id){

		RHcongeRepository.delete(RHcongeRepository.getOne(id));

	}


	@PutMapping(value="/RHconge/{id}")

	public RHconge edit(@PathVariable Long id, @RequestBody RHconge RHconge){

		RHconge.setId(id);

		return RHcongeRepository.saveAndFlush(RHconge);

	}

}
