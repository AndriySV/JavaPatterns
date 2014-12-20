package com.as.structural.adapter.iteratorEnumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();

		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(1);

		@SuppressWarnings("rawtypes")
		Iterator iterator = arrayList.iterator();

		IteratorEnumerationAdapter iteratorEnumerationAdapter = new IteratorEnumerationAdapter(
				iterator);

		while (iteratorEnumerationAdapter.hasMoreElements()) {
			System.out.print(iteratorEnumerationAdapter.nextElement() + " ");
		}

	}

}
