package com.raish.emplservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.raish.emplservice.model.Empl;
import com.raish.emplservice.service.EmplService;

@RestController
public class EmplController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EmplService emplService;
	
	@GetMapping("/emp")
	List<Empl> findAll (){
		List<Empl> emp = emplService.getAllEmployee();
		return emp;
	}
	
	
	@GetMapping("/emp/{id}")
	ResponseEntity<Empl> getEmployeeById(@PathVariable("id") int id,String name,String email){
		
			
			Empl emp = emplService.getEmplById(id);
			
				
				ResponseEntity<String> adrs = restTemplate.exchange("http://localhost:8082/address/1", HttpMethod.GET, null, String.class);
				 Empl ep = new Empl();
				ep.setName(adrs.getBody());
				ep.setEmail(adrs.getBody());
							
			return ResponseEntity.ok(ep);
		//return ResponseEntity.ok("done!! Email sent successfully ."+e);
			
			//return ResponseEntity.status(HttpStatus.OK).body(emp);
					
			//return restTemplate.getForObject(url, ResponseEntity.class, emp);
					
			
		}
				
		
	}

