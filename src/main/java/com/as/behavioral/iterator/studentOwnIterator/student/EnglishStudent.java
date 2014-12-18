package com.as.behavioral.iterator.studentOwnIterator.student;

import com.as.behavioral.iterator.studentOwnIterator.iterator.EnglishStudentIterator;
import com.as.behavioral.iterator.studentOwnIterator.iterator.Iterator;

public class EnglishStudent implements Students {
	Student[] studentArray;
	
	public EnglishStudent() {
		studentArray = new Student[3];
		addStudents();
	}
	
	private void addStudents() {
		studentArray[0] = new Student("Mike", "ENG", 22);
		studentArray[1] = new Student("Kate", "ENG", 27);
		studentArray[2] = new Student("Greg", "ENG", 23);
	}

	@Override
	public Iterator createIterator() {
		return new EnglishStudentIterator(studentArray);
	}

}
