package com.as.structural.composite.chapter;

import java.util.ArrayList;
import java.util.Iterator;

public class SuperChapter implements ChapterComponent {
	private String title;
	private int page;
	
	private ArrayList<ChapterComponent> chapterList = new ArrayList<ChapterComponent>();
	
	public SuperChapter(String title, int page) {
		this.title = title;
		this.page = page;
	}

	@Override
	public void add(ChapterComponent chapterComponent) {
		chapterList.add(chapterComponent);
	}

	@Override
	public void remote(ChapterComponent chapterComponent) {
		chapterList.remove(chapterComponent);
	}

	@Override
	public ChapterComponent getChild(int i) {
		return chapterList.get(i);
	}

	@Override
	public void print() {
		System.out.println( title + ", " + "page:" + page);
		
		Iterator<ChapterComponent> iterator = chapterList.iterator();
		while (iterator.hasNext()) {
			ChapterComponent chapterComponent = iterator.next();
			chapterComponent.print();
		}
	}

}
