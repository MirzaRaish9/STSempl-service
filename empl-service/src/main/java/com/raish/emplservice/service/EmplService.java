package com.raish.emplservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raish.emplservice.model.Empl;
import com.raish.emplservice.repository.EmplRepository;


@Service
public class EmplService {

	@Autowired
	private EmplRepository emplRepository;
	
//	public EmplService(EmplRepository empRepository) {
//		this.emplRepository = empRepository;
//	}
	
	public Empl getEmplById(int id) {
		Empl empl = emplRepository.findById(id).get();
		return empl;
	}
	
	public  List<Empl> getAllEmployee() {
		return emplRepository.findAll();
	}
}
