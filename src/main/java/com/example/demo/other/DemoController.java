package com.example.demo.other;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Puppy;
import com.example.demo.service.PuppyService;

@RestController
public class DemoController {

	private PuppyService service;

	public DemoController(PuppyService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {

		return "Hello World";
	}

	@PostMapping("/createPuppy")
	public void createPuppy(@RequestBody Puppy puppy) {
		this.service.createPuppy(puppy);

	}

	@GetMapping("/puppy/all")
	public ArrayList<Puppy> getAllPuppy() {
		return this.service.getAllPuppy();
	}

	@GetMapping("/getPuppy/{id}")
	public Puppy getPuppy(@PathVariable int id) {
		return this.service.getPuppy(id);
	}

	@DeleteMapping("/deletePuppy/{id}")
	public String deletePuppy(@PathVariable int id, @RequestBody Puppy puppy) {
		
		return this.service.deletePuppy(id, puppy);
	}

	@PutMapping("/putPuppy/{id}")
	public Puppy putPuppy(@PathVariable int id, @RequestBody Puppy newPuppy) {
		return this.service.getPuppy(id);
	}

	@PatchMapping("/patchPuppy/{id}")
	public String patchPuppy(@PathVariable int id, @RequestBody Puppy puppy) {
		return this.service.patchPuppy(id, puppy);
	}

}
