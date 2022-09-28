/*Q1:Write a program using array accept the size from the user than accordingly 
  accept the no from the user and find out the greater no,smaller no, ascending, Descending
  */
  import java.util.*;

public class Array {

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int i;

    void display1() {
        System.out.println("enter " + size + " numbers :");
    }

    int num[] = new int[size];

    void accept() {

        for (i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            System.out.println(" the given array is :" + num[i]);
        }
        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[j] < num[i]) { // condition for greater number
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }

        }
        System.out.println("the larger no of this array :" + num[size - 1]);

        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[j] > num[i]) {// condition for smaller number
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("the smaller no of this array :" + num[size - 1]);
    }

    void sortA() {

        System.out.println("sort of array in desending order :");
        for (i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
        Arrays.sort(num); // function use for sort number
        System.out.println("sorting of array in assending order :");
        for (i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Array a1 = new Array();
        a1.display1();
        a1.accept();
        a1.sortA();

    }
}
