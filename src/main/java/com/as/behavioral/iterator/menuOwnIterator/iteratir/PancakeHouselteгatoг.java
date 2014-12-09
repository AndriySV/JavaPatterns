package com.as.behavioral.iterator.menuOwnIterator.iteratir;

import java.util.ArrayList;

import com.as.behavioral.iterator.menuOwnIterator.MenuItem;

public class PancakeHouselteгatoг implements Iterator {
	private ArrayList<MenuItem> arrayList;
	private int position;
	private MenuItem menuItem;
	
	
	public PancakeHouselteгatoг(ArrayList<MenuItem> arrayList) {
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
