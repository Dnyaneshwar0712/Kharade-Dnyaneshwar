package com.cjc;

public class Voting {
	
	public static void main(String[] args) {
		int age=45;
		int weight=78;
		
		if(age>=21 && age<=60) {
			System.out.println("the voter is eligible for blood donation");
			
			if (weight>=40 && weight<=70) {
				System.out.println("weight is valid  for blood donation");
			}
		}
		else {
			System.out.println("the voter is not eligible for blood donation");
		}
	}
}
