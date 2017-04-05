package com.test.appmodernization.demo;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter lower case character or digit. No data ends.");
		ch = scan.next().charAt(0);	
		Conditions c =new Conditions();
		System.out.println(c.checkAlphaDigit(ch));
		
	}
	
	public String checkAlphaDigit(char ch)
	{
		if(Character.isAlphabetic(ch))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				return "The letter " +ch +" is a vowel.";
			}
			else
			{
				return "The letter " +ch +" is a consonant.";
			}
		}
		else if(Character.isDigit(ch))
		{
			return ch + " is a digit";
		}
		else
		{
			return "problems found";
		}
	}

}
