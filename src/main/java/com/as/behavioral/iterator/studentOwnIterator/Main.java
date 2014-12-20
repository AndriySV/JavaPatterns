package com.as.behavioral.iterator.studentOwnIterator;

import com.as.behavioral.iterator.studentOwnIterator.iterator.Iterator;
import com.as.behavioral.iterator.studentOwnIterator.student.EnglishStudent;
import com.as.behavioral.iterator.studentOwnIterator.student.Students;
import com.as.behavioral.iterator.studentOwnIterator.student.UkrainianStudent;

public class Main {

	public static void main(String[] args) {
		
		Students ukrainianStudent= new UkrainianStudent();
		Students englishStudent = new EnglishStudent();
		
		Iterator iterator;
		
		iterator = ukrainianStudent.createIterator();
		showStudents(iterator);
		
		iterator = englishStudent.createIterator();
		showStudents(iterator);
		
	}

	private static void showStudents(Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
	}

}
