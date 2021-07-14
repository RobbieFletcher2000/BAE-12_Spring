package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.data.Puppy;

@Service
public class PuppyServiceList implements PuppyService {

	
	public String hello() {

		return "Hello World";
	}

	private ArrayList<Puppy> puppies = new ArrayList<>();

	@Override
	public void createPuppy(Puppy puppy) {
		System.out.println(puppy);
		this.puppies.add(puppy);

	}

	@Override
	public ArrayList<Puppy> getAllPuppy() {
		for (Puppy pup : puppies) {
			System.out.println(pup);
		}
		return puppies;
	}

	@Override
	public Puppy getPuppy(int id) {
		Puppy found = puppies.get(id);
		return found;
	}

	@Override
	public String deletePuppy(int id, Puppy puppy) {
		this.puppies.remove(id);
		return "Deleted puppy at index: " + id;
	}

	@Override
	public Puppy putPuppy(int id, Puppy newPuppy) {
		return this.puppies.set(id, newPuppy);
	}

	@Override
	public String patchPuppy(int id, Puppy puppy) {
		return "Updated puppy at index: " + id;
	}

}
