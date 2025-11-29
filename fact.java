Write a program to find Factorial of a Given Number?
import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid InPut");
        }
        else
        {
            int factorial=1;
            for(int i=1;i<=n;i++)
            {
                factorial*=i;
            }
            System.out.println(factorial);
        }
    }
}