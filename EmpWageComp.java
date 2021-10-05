package com.employeewage;

import java.util.Random;

public class EmpWageComp {

	public static void main(String args[]) {
		System.out.println("Welcom to employee Wage problem");
		attendance();
		
	}
	static void attendance()
	{
		int isPresent = 1 ;
		Random rn = new Random();
		int check = rn.nextInt(2);
		
		if (check == isPresent)
		{
			System.out.println("Employee is Present");
			
		}
		else
		{
			System.out.println("Employee is Absent");
			
		}
	}
}
