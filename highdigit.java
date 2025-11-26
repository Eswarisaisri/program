Write a Program to print the Highest digit in a Given Number?
import java.util.Scanner;
class highdigit
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        if(n<=0)
        {
            System.out.println("Invalid Input.");
        } 
        else
        {
            Maxdig(n);
        }
    }
    static void Maxdig(int n)
    {
        int max=0;
        while(n>0)
        {
            int r=n%10;
            if(r>max)
            {
                max=r;
            }
            n=n/10;
        }
        System.out.println("Highest Digit in a Given Number is "+ + max + ".");
    }
}