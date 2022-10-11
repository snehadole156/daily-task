/*single:
WAP to create two class one class do the process of fibonacci series and in second class find out the graeter between two no. From second class display both the operation*/
package Inheritance_demo;

import Inheritance_demo.Inheritance_p;
import java.util.Scanner;
public class Inheritance_p {
	public static void fib() {
		int num1=0,num2=1,num3,i,count;
		 System.out.println("Enter the required number for list : ");
		 Scanner sc = new Scanner(System.in);
		 count=sc.nextInt();
		 //printing 0 and 1
		 System.out.print(num1+" "+num2);
		 //loop starts from 2 because 0 and 1 are already printed
		 for(i=2;i<count;++i)    
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		  sc.close();
		 }
	}
}
--------------------------------------------------
  import Inheritance_demo.Inheritance_p;
import java.util.Scanner;
public class GRT_OF_TWO extends Inheritance_p {

	public static void greater()
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is grteater"+num2);
		}
		else
		{
			System.out.println(num2+" is greater"+num1);
		}
	
	}
	public static void main(String args[])
	{
		greater();
		fib();
	
	}
		
  }
