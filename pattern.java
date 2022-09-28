import java.util.*;

public class Pattern_q {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    public void ABC() {
        System.out.println("This is the alphabets:");
        int alph = 65;
        int i, j;
        for (i = 0; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) (alph + j) + " ");
            }
            System.out.println();
        }
    }

    public void numbers() {
        System.out.println("this is the number pattern:");
        int i, j;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - 1; j++)
                System.out.print(" ");
        }
        for (j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    public void star() {
        System.out.println("this is the star pattern:");
        int i, j;
        for (i = 0; i <= a; i++) {
            for (j = a - 1; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void numbers10() {
        System.out.println("this is the 0 and 1 pattern:");
        int i, j;
        for (i = 0; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.println("0");
                }
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("enter the value of row:");
        Pattern_q s = new Pattern_q();
        s.ABC();
        s.numbers();
        s.star();
        s.numbers10();
    }
}
