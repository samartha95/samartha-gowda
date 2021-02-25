package com.arraylist;

public class Main {
	int i;
	

	public Main(int i) {
		super();
		this.i = i;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		return this.i==((Main)obj).i;
	}


	@Override
	public String toString() {
		return "Main [i=" + i + "]";
	}


	public static void main(String[] args) {
		

	}

}
