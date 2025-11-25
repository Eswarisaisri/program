Write a program to check given number is prime number or not.
import java.util.Scanner;
class prime5
{
    public static void main(String args[])
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fc=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                fc++;
            }
        }
    
        if(fc==0&&n>1)
        {
            System.out.println("Prime Number");
        }
        else if(n<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
    
}