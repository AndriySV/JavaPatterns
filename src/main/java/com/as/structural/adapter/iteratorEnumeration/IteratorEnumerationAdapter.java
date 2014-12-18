package com.as.structural.adapter.iteratorEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class IteratorEnumerationAdapter implements Enumeration{
	Iterator iterator;
	
	public IteratorEnumerationAdapter(Iterator iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
