package com.as.behavioral.iterator;

import java.util.ArrayList;

public class PancakeHouselteгatoг implements Iterator {
	private ArrayList arrayList;
	private int position;
	private MenuItem menuItem;
	
	
	public PancakeHouselteгatoг(ArrayList arrayList) {
		this.arrayList = arrayList;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= arrayList.size() || arrayList.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		menuItem = (MenuItem) arrayList.get(position);
		position++;
		
		return menuItem;
	}

}
