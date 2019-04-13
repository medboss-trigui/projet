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

import com.example.dao.ModificationRepository;
import com.example.entities.Modification;

@RestController
@CrossOrigin("*")
public class ModificationController {

	@Autowired
	private ModificationRepository modificationRepository;

	@GetMapping(value="/modifications")

	public List<Modification> getModifications(){

		return modificationRepository.findAll();

	}

	@GetMapping(value="/modification/{id}")

	public Modification getModification(@PathVariable Long id){

		return modificationRepository.findById(id).get();

	}

	@PostMapping(value="/modifications")

	public Modification save(@RequestBody Modification modification){

		return modificationRepository.save(modification);

	}

	@DeleteMapping(value="/modification/{id}")

	public void delete(@PathVariable Long id){

		modificationRepository.delete(modificationRepository.getOne(id));

	}


	@PutMapping(value="/modification/{id}")

	public Modification edit(@PathVariable Long id, @RequestBody Modification modification){

		modification.setId(id);

		return modificationRepository.saveAndFlush(modification);

	}

}
