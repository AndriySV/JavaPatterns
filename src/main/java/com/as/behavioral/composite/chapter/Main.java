package com.as.behavioral.composite.chapter;

public class Main {

	public static void main(String[] args) {
		
		ChapterComponent allChapters = new SuperChapter("All chapters", 2);
		
		ChapterComponent chapter1 = new Chapter("It's chapter number 1", 5);
		ChapterComponent chapter2 = new SuperChapter("It's chapter number 2", 10);
		ChapterComponent chapter21 = new SuperChapter("It's chapter number 21", 13);
		ChapterComponent chapter211 = new Chapter("It's chapter number 211", 17);
		ChapterComponent chapter22 = new Chapter("It's chapter number 22", 23);
		
		chapter2.add(chapter21);
		chapter21.add(chapter211);
		
		chapter2.add(chapter22);
		
		allChapters.add(chapter1);
		allChapters.add(chapter2);
		
		allChapters.print();
	}

}
