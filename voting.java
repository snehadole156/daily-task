import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age:");
		age = sc.nextInt();
     if(age >= 18)
     {
    	 System.out.println("Eligible for voting:");
     }
     else
     {
    	 System.out.println("You are not eligble for voting");
     }
	}
}
