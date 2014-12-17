package com.as.behavioral.iterator.studentIterator.student;

import java.util.Iterator;
import java.util.LinkedList;

public class UkrainianStudent implements Students {
	private LinkedList<Student> studentList;
	
	public UkrainianStudent() {
		studentList = new LinkedList<Student>();
		addStudents();
	}
	
	private void addStudents() {
		studentList.add(new Student("Ivan", "UKR", 21));
		studentList.add(new Student("Volodymyr", "UKR", 24));
		studentList.add(new Student("Stepan", "UKR", 20));
	}

	@Override
	public Iterator<Student> createIterator() {
		return studentList.iterator();
	}

}
