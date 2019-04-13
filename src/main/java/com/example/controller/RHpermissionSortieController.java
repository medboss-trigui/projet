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

import com.example.dao.RHpermissionSortieRepository;
import com.example.entities.RHpermissionSortie;

@RestController
@CrossOrigin("*")
public class RHpermissionSortieController {

	@Autowired
	private RHpermissionSortieRepository RHpermissionSortieRepository;

	@GetMapping(value="/RHpermissionSorties")

	public List<RHpermissionSortie> getRHpermissionSorties(){

		return RHpermissionSortieRepository.findAll();

	}

	@GetMapping(value="/RHpermissionSortie/{id}")

	public RHpermissionSortie getRHpermissionSortie(@PathVariable Long id){

		return RHpermissionSortieRepository.findById(id).get();

	}

	@PostMapping(value="/RHpermissionSorties")

	public RHpermissionSortie save(@RequestBody RHpermissionSortie RHpermissionSortie){

		return RHpermissionSortieRepository.save(RHpermissionSortie);

	}

	@DeleteMapping(value="/RHpermissionSortie/{id}")

	public void delete(@PathVariable Long id){

		RHpermissionSortieRepository.delete(RHpermissionSortieRepository.getOne(id));

	}


	@PutMapping(value="/RHpermissionSortie/{id}")

	public RHpermissionSortie edit(@PathVariable Long id, @RequestBody RHpermissionSortie RHpermissionSortie){

		RHpermissionSortie.setId(id);

		return RHpermissionSortieRepository.saveAndFlush(RHpermissionSortie);

	}

}
