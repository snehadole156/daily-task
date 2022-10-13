/*Q2) "Multilevel:
WAP to create a class Reverse No, second class SOD, Third class use both the class property and display the output*/
package inheritance;
import java.util.Scanner;
public class Multi_Inheritance {

	public static void Reverse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
System.out.println("Reverse Number is:"+rev);
	}

}
--------------------------
package inheritance;
import java.util.Scanner;
public class Mul_Inherit extends Multi_Inheritance{

	public static void SOD() {
		int number, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();  
		while(number > 0)  
		{  
		digit = number % 10;  
		sum = sum + digit;  
		number = number / 10;  
		} 
		System.out.println("Sum of Digits: "+sum); 

	}

}
------------------------------------
package inheritance;

public class Multi_In extends Mul_Inherit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("high display");
       Reverse();
       SOD();
	}

}
