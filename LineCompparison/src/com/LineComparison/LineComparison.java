package com.LineComparison;

public class LineComparison {

	public static void main(String[] args) {
		
		int x1=3,x2=5,y1=2,y2=6;
		
		double LENGTH_OF_FIRST_LINE = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

		int x3=3,x4=5,y3=2,y4=6;
		
		double LENGTH_OF_SECOND_LINE = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		System.out.printf("Length of First Line is :: %.2f \n",LENGTH_OF_FIRST_LINE);
		System.out.printf("Length of Second Line is :: %.2f \n",LENGTH_OF_SECOND_LINE);
	
		if (LENGTH_OF_FIRST_LINE == LENGTH_OF_SECOND_LINE) {
			System.out.println("Lines Are Equal");
		}
		else {
			System.out.println("Lines are not equal");
		}
	}

}
