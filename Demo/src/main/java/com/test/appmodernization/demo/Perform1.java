package com.test.appmodernization.demo;

public class Perform1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perform1 perform=new Perform1();
		perform.TopLevel();
	}
	
	public void TopLevel()
	{
		System.out.println("In TopLevel. Starting to run program");
		OneLevelDown();
		System.out.println("Back in TopLevel.");
	}
	public void OneLevelDown()
	{
		System.out.println(">>>> Now in OneLevelDown");
		TwoLevelsDown();
		System.out.println(">>>> Back in OneLevelDown");
	}
	public void TwoLevelsDown()
	{
		System.out.println(">>>> Now in TwoLevelsDown");
		ThreeLevelsDown();
		System.out.println(">>>> Back in TwoLevelsDown");
	}
	public void ThreeLevelsDown()
	{
		System.out.println(">>>> Now in ThreeLevelsDown");
	}
	
}
