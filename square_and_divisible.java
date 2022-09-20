import java.math.*;
class SquareNo 
{
    public static void main(String args[])
    {
    int no;
    System.out.println("Enter number:");
    Scanner sc=new Scanner(System.in);
    no=sc.nextInt();
    if(no%5==0)
    {
        System.out.println("Square of "+no+ " is "+(no*no));
    }
    else
    {
        System.out.println("Entered number is not divisible by 5 ");
   }

    }
     }
