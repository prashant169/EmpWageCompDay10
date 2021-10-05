package com.employeewage;
 
import java.util.Random;
  
public class  EmpWageComp {
        public static void main( String []args )
        {
                System.out.println("Welcome");
                dhoni();
        }

                static void dhoni(){
                                        int TotalWorkingHour = 8 ;
                                        int TotalWorkingDay  = 20 ;
                                        int RatePerHour = 20 ;
                                        
                                        Random rn = new Random();
                                        int rand = rn.nextInt(3);
                                        if (rand == 0)
                                        {
                                                System.out.println("----------This is Full time Work in Month---------");
                                                int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerHour ;
                                                System.out.println("Total Employee Wages is: " + TotaEmployeeWage);
                                        }
                                        else if (rand == 0)
                                        {
                                                System.out.println("-------This is Part Time Work in Month--------");
                                                int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerHour  ;
                                                System.out.println("Total Employee Wages is: "+ TotaEmployeeWage);
                                        }
                                        else
                                        {
                                                System.out.println("----Employee is Absent------");
                                        }



                           }


}


