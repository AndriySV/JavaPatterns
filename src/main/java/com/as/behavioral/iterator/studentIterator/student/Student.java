package com.as.behavioral.iterator.studentIterator.student;

public class Student {
	
	private String name;
	private String nationality;
	private int age;
	
	public Student(String name, String nationality, int age) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", nationality=" + nationality
				+ ", age=" + age + "]";
	}
	
}