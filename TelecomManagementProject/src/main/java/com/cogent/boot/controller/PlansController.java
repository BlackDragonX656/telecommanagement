package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Plans;
import com.cogent.boot.repo.PlansRepo;

@RestController
@RequestMapping("/api/plans")
public class PlansController {

	@Autowired
	PlansRepo pr;
	
	@GetMapping("/getPlans")
	public List<Plans> getPlans(){
		return pr.findAll();
	}
	
	@PostMapping("/addPlans")
	public Plans addPlans(@RequestBody Plans p) {
		return pr.save(p);
	}
	
	@DeleteMapping("/deletePlans/{pid}")
	public void deletePlans(@PathVariable("pid") int pid) {
		pr.deleteById(pid);
	}
}
