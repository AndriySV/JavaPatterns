package com.as.behavioral.iterator.studentOwnIterator.iterator;

import java.util.LinkedList;

import com.as.behavioral.iterator.studentOwnIterator.student.Student;

public class UkrainianStudentIterator implements Iterator {
	private LinkedList<Student> studentList;
	int index;

	public UkrainianStudentIterator(LinkedList<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public Student next() {
		Student student = studentList.get(index);
		index++;
		
		return student;
	}

	@Override
	public boolean hasNext() {
		if (index >= studentList.size() || studentList.get(index) == null) {
			return false;
		} else {
			return true;
		}
	}

}
