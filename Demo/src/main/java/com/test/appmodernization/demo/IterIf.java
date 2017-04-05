package com.test.appmodernization.demo;

import java.util.Scanner;

public class IterIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,operator,res=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1=scan.nextInt();
		System.out.println("Enter second number");
		num2=scan.nextInt();
		System.out.println("Enter the operator (+ or *): ");
		operator = scan.next().charAt(0);
		if(operator == '+'){
			res = num1 + num2;
		}
		else if(operator == '*'){
			res = num1 * num2;
		}
		System.out.println("Result is = " + res);

	}

}
