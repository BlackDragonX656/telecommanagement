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

import com.cogent.boot.entity.Customercare;
import com.cogent.boot.repo.CustomercareRepo;


@RestController
@RequestMapping("/api/customercare")
public class CustomercareController {

	@Autowired
	CustomercareRepo cr;
	
	@GetMapping("/getCustomerCare")
	public List<Customercare> getCustomerCare(){
		return cr.findAll();
	}
	
	@PostMapping("/addCustomerCare")
	public Customercare addCustomerCare(@RequestBody Customercare cc) {
		return cr.save(cc);
	}
	
	@DeleteMapping("/deleteCustomerCare/{ccid}")
	public void deleteCustomerCare(@PathVariable("ccid") int ccid) {
		cr.deleteById(ccid);
	}
}
