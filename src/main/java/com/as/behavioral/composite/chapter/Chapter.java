package com.as.behavioral.composite.chapter;

public class Chapter implements ChapterComponent {
	private String title;
	private int page;
	
	public Chapter(String title, int page) {
		this.title = title;
		this.page = page;
	}

	@Override
	public void add(ChapterComponent chapterComponent) {
		new UnsupportedOperationException();
	}

	@Override
	public void remote(ChapterComponent chapterComponent) {
		new UnsupportedOperationException();
	}

	@Override
	public ChapterComponent getChild(int i) {
		return null;
	}

	@Override
	public void print() {
		System.out.println(title + ", " + "page: " + page);
	}

}