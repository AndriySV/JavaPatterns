package com.as.behavioral.iterator.studentIterator.iterator;

import java.util.Iterator;

import com.as.behavioral.iterator.studentIterator.student.Student;


public class EnglishStudentIterator implements Iterator<Student> {
	private Student[] studentArray;
	private int index;
	
	public EnglishStudentIterator(Student[] studentArray) {
		this.studentArray = studentArray;
	}

	@Override
	public Student next() {
		Student student = studentArray[index];
		index++;
		return student;
	}

	@Override
	public boolean hasNext() {
		if (index >= studentArray.length || studentArray[index] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() {
		new UnsupportedOperationException();
	}

}