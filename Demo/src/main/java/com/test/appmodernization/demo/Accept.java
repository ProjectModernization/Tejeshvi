package com.test.appmodernization.demo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ln;
		String[] lnVector;
		StudentDetails sdObj=new StudentDetails();
				
		System.out.println("Enter student details using template below");
		System.out.println("Enter - ID,Surname,Initials,CourseCode,Gender");
		Scanner scan= new Scanner(System.in);
		ln=scan.nextLine();
		
		lnVector = ln.split(",");
		sdObj.ID=Integer.parseInt(lnVector[0]);
		sdObj.lName=lnVector[1];
		sdObj.Initials=lnVector[2];
		sdObj.CourseCode=lnVector[3];
		sdObj.Gender=lnVector[4];
		
		Calendar cal= Calendar.getInstance();
		int DayOfYear=cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("Name is "+sdObj.Initials+" "+sdObj.lName);
		System.out.println("Date is  "+new SimpleDateFormat("MM dd yyyy").format(Calendar.getInstance().getTime()));
		System.out.println("Today is day " + DayOfYear+ " of the year");
		System.out.println( "The Time is  "+new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime()) );
		
	}
}

class StudentDetails{
	int ID;
	String lName, Initials, CourseCode, Gender;
}

