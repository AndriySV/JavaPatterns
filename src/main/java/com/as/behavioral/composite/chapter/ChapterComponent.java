package com.as.behavioral.composite.chapter;

public interface ChapterComponent {
	
	public void add(ChapterComponent chapterComponent);
	
	public void remote(ChapterComponent chapterComponent);
	
	public ChapterComponent getChild(int i);
	
	public void print();
	
	

	
}
