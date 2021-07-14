package com.example.demo.data;

public class Puppy {
	
	private String name;
	private String breed;
	private int age;
	private int cuteness;
	
	
	public Puppy(String name, String breed, int age, int cuteness) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.cuteness = cuteness;
	}
	public Puppy() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCuteness() {
		return cuteness;
	}

	public void setCuteness(int cuteness) {
		this.cuteness = cuteness;
	}
	
	@Override
	public String toString() {
		return "Puppy [name=" + name + ", breed=" + breed + ", age=" + age + ", cuteness=" + cuteness + "]";
	}

}
