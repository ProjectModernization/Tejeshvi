package com.test.appmodernization.demo;

import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,res;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first number  (1 digit)");
		num1=scan.nextInt();
		System.out.println("Enter second number  (1 digit)");
		num2=scan.nextInt();
		res=num1*num2;
		System.out.println("Result is = " + res);
		
	}

}
