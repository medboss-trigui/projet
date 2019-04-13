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

import com.example.dao.RHevaluationEmpRepository;
import com.example.entities.RHevaluationEmp;

@RestController
@CrossOrigin("*")
public class RHevaluationEmpController {

	@Autowired
	private RHevaluationEmpRepository RHevaluationEmpRepository;

	@GetMapping(value="/RHevaluationEmps")

	public List<RHevaluationEmp> getRHevaluationEmps(){

		return RHevaluationEmpRepository.findAll();

	}

	@GetMapping(value="/RHevaluationEmp/{id}")

	public RHevaluationEmp getRHevaluationEmp(@PathVariable Long id){

		return RHevaluationEmpRepository.findById(id).get();

	}

	@PostMapping(value="/RHevaluationEmps")

	public RHevaluationEmp save(@RequestBody RHevaluationEmp RHevaluationEmp){

		return RHevaluationEmpRepository.save(RHevaluationEmp);

	}

	@DeleteMapping(value="/RHevaluationEmp/{id}")

	public void delete(@PathVariable Long id){

		RHevaluationEmpRepository.delete(RHevaluationEmpRepository.getOne(id));

	}


	@PutMapping(value="/RHevaluationEmp/{id}")

	public RHevaluationEmp edit(@PathVariable Long id, @RequestBody RHevaluationEmp RHevaluationEmp){

		RHevaluationEmp.setId(id);

		return RHevaluationEmpRepository.saveAndFlush(RHevaluationEmp);

	}

}
