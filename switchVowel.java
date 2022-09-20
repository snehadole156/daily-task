import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character");
		c=sc.next().charAt(0);
		z=Character.toUpperCase(c);
		
		switch(z) 
		{
		case 'A':
		case 'E':	
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c+" is a Vowel");
			break;
			
			default: System.out.println(c+" is a Non-Vowel Character");
			}
	}

}
