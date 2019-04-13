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

import com.example.dao.ValidationRepository;
import com.example.entities.Validation;

@RestController
@CrossOrigin("*")
public class ValidationController {

	@Autowired
	private ValidationRepository validationRepository;

	@GetMapping(value = "/validations")

	public List<Validation> getValidations() {

		return validationRepository.findAll();

	}

	@GetMapping(value = "/validation/{id}")

	public Validation getValidation(@PathVariable Long id) {

		return validationRepository.findById(id).get();

	}

	@PostMapping(value = "/validations")

	public Validation save(@RequestBody Validation validation) {

		return validationRepository.save(validation);

	}

	@DeleteMapping(value = "/validation/{id}")

	public void delete(@PathVariable Long id) {

		validationRepository.delete(validationRepository.getOne(id));

	}

	@PutMapping(value = "/validation/{id}")

	public Validation edit(@PathVariable Long id, @RequestBody Validation validation) {

		validation.setId(id);

		return validationRepository.saveAndFlush(validation);

	}

}
