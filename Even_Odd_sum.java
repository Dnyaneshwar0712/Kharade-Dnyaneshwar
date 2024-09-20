package com.cjc;

public class Even_Odd_sum {
public static void main(String[] args) {
	int evensum=0;
	int oddsum=0;
 for(int i=1;i<=100;i++) {
	 if(i%2==0) {
		 evensum=evensum+i;
		 System.out.println(i);
	 }
	  if  (i%2!=0) {
		 oddsum=oddsum+i;
	 }
	 
 }    
 System.out.println("sum of the even number is :"+evensum);
 System.out.println("sum of the odd number is:"+oddsum);
}
}
