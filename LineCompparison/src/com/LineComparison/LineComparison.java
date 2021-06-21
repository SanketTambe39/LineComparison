package com.LineComparison;

public class LineComparison {

	public static void main(String[] args) {
		
		int x1=3,x2=5,y1=2,y2=6;
		
		double LENGTH_OF_LINE = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

		System.out.println("From the given input distance between these two lines is ::"+LENGTH_OF_LINE);
		
	}

}
