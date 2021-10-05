package com.employeewage;

import java.util.Random;

public class EmpWageComp {
	
	public static void main(String args[]) {
		System.out.println("Welcome To Employee Wage");
		DailyWages();
	
		
	}
		public static void DailyWages()
		{
			int IsFullTime= 1;
			Random rn = new Random();			
			int check = rn.nextInt(2);
			int RatePerHour = 20 ;
			int FullDayHour = 8 ;
			int TotalWage = 0 ;
			if (check == IsFullTime)
			{
				System.out.println("Employee is present");
				TotalWage =RatePerHour * FullDayHour;
				System.out.println("Daily Wages : "+TotalWage);
				
			}
			else
			{
				System.out.println("Employee Absent");
				
			}
			
		}
	
}

