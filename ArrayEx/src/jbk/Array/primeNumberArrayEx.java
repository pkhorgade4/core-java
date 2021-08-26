package jbk.Array;

import java.util.Scanner;

public class primeNumberArrayEx {
public static void main(String[] args) {
	int a[]=new int [5];
	
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	a[5]=6;
	System.out.println("Enter the element of array");
	for (int i = 0; i < a.length; i++) {
		
	}
	for (int i = 0; i < a.length; i++) {
		boolean isPrime=true;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				isPrime=false;
				
			}
		}
		if(isPrime)
			System.out.println(i + "are the prime no in the array");
	}
}
}
