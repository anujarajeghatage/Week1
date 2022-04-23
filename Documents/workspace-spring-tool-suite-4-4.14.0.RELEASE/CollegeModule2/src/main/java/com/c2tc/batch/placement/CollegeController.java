package com.c2tc.batch.placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
	   @Autowired
	   private CollegeService service;
	   
	   //TO RETRIVE ALL THE ROWSS
	   @GetMapping("/colleges")
	   public List<College>list()
		{
		return service.listAll();
		}

	   
	 //RETRIEVE SPECIFIC RECORD
		@GetMapping("/colleges/{id}")
		public ResponseEntity<College>get(@PathVariable Integer id)
		{
			College college=service.get(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);
		}
		
		//CREATE ROW IN DATABASE
		
		@PostMapping("/colleges")
		public void add(@RequestBody College college)
		{
			service.save(college);
		}
	    
		
		//UPDATE OPERATIONs
		
		
		@PutMapping("/colleges/{id}")
		public ResponseEntity<?> update(@RequestBody College college,@PathVariable Integer id)
		{
			try {
				College existcollege=service.get(id);
				service.save(college);
				return new ResponseEntity<College>(college,HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		}
		
		
		//delete operation
		@DeleteMapping("/colleges/{id}}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}

}
