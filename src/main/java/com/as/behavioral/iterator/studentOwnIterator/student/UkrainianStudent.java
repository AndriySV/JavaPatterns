package com.as.behavioral.iterator.studentOwnIterator.student;

import java.util.LinkedList;

import com.as.behavioral.iterator.studentOwnIterator.iterator.Iterator;
import com.as.behavioral.iterator.studentOwnIterator.iterator.UkrainianStudentIterator;

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
	public Iterator createIterator() {
		return new UkrainianStudentIterator(studentList);
	}

}
