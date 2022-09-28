WAP to accept  aceept Student name , Marks of 5 subject, calculate the Percentage and display the grade
import java.util.*;

class Student_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("enter name of Student :");

        String s = sc.next();

        System.out.println("Enter a 5 subject marks :");

        for (int i = 0; i < 5; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("Student Name is :" + s);
        System.out.println("The marks of array :");

        for (int i = 0; i < 5; i++) {

            System.out.println(a[i]);

        }
        int add;
        add = a[0] + a[1] + a[2] + a[3] + a[4];

        int per = add / 5;

        System.out.println("The addition of marks is " + add + "The percentage of marks is " + per + "%");

        if (per >= 90 && per <= 100) {

            System.out.println("Grade A+");
        } else if (per >= 80 && per <= 89) {
            System.out.println("Grade A");

        }

        else if (per >= 70 && per <= 79) {
            System.out.println("Grade B");

        } else if (per >= 60 && per <= 69) {
            System.out.println("Grade C");
        }

        else if (per >= 50 && per <= 59) {
            System.out.println("Grade D");

        } else if (per >= 35 && per <= 49) {
            System.out.println("Grade E");

        }

        else {

            System.out.println("Fail");

        }
        sc.close();
    }
}
