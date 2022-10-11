/*Multilevel:
WAP to crate three class, one class implemet the prime no prcess, second class implement the swapping of two no, third class imepelment the find out the average 
of student marks.*/
package inheritance;
import java.util.Scanner;
public class Inheritance_2 {

	public static void Prime(){
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		System.out.println(+num+"is a prime number");
		else {
			System.out.println(+num+"is not prime number");
		}
	}
}
-----------------------------------------------
  package inheritance;
import java.util.Scanner;

public class Swapping extends Inheritance_2 {

	public static void A() {
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("before swap ");
		System.out.println(a+ " is a");
		System.out.println(b+ " is b");
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap ");
		System.out.println(a+ " is a");
		System.out.println(b+ " is b");
	}

}
--------------------------------------
  package inheritance;
import java.util.Scanner;
public class Avrage extends Swapping{

	public static void B() {
		  int mark[] = new int[5],i;
	        float sum=0,avg; 
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter marks for 5 Subjects : ");
	        for(i=0; i<5; i++)
	        {
	            mark[i] = scan.nextInt();
	            sum = sum + mark[i];
	        }
	         avg= sum/5;
	    System.out.print("Average Marks = " +avg);
	    }
}
------------------------------------------------
  package inheritance;
public class Inheritance_3 extends Avrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime();
		A();
		B();

	}

}
