package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.data.Puppy;

public interface PuppyService {

	public void createPuppy(Puppy puppy);

	public ArrayList<Puppy> getAllPuppy();

	public Puppy getPuppy(int id);

	public String deletePuppy(int id, Puppy puppy);

	public Puppy putPuppy(int id, Puppy newPuppy);

	public String patchPuppy(int id, Puppy puppy);

}
