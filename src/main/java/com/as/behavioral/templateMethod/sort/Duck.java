package com.as.behavioral.templateMethod.sort;

public class Duck implements Comparable<Duck> {
	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + " weighs " + weight;
	}

	@Override
	public int compareTo(Duck o) {
		if (weight > o.weight) {
			return 1;
		} else if (weight < o.weight) {
			return -1;
		} else if (name.compareTo(o.name) > 0) {
			return 1;
		} else if (name.compareTo(o.name) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
