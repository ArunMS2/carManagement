package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	interFace f1;
	
	@GetMapping("/get")
	public List<car> getDetails()
	{
		System.out.println("Showing the Details Present In The Table");
		return f1.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		f1.deleteById(id);
		return "Id : "+id+" is deleted succesfully";
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody car b1)
	{
		f1.save(b1);
		return "Car Details Successfully Saved In The DataBase";
	}
	
	@PutMapping("/put/{id}")
	public car updateCarDetails(@RequestBody car b)
	{
		System.out.println("The Changes are Updated");
		return f1.save(b);
		
	}
}
