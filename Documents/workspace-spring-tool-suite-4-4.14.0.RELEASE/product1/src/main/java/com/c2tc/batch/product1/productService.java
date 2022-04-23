package com.c2tc.batch.product1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class productService {
	@Autowired
	private ProductRepository repository;
	public List<Product>listAll()
	{
		return repository.findAll();
	}
	
	
 public Product get(Integer id)
 {
	 return repository.findById(id).get();
 }
 
 public void save(Product product)
 {
	 repository.save(product);
 }
 
 public void delete(Integer id)
 {
	 repository.deleteById(id);
 }
}
