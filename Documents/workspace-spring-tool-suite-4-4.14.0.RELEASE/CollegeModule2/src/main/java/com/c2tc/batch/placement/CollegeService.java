package com.c2tc.batch.placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CollegeService {
	@Autowired
	private CollegeRepository repository;
	public List<College> listAll() {
		
		return repository.findAll();
	}

	
	public College get(Integer id) 
	{
		return repository.findById(id).get();
	}

	public void save(College college) {
		repository.save(college);
		
	}

	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
