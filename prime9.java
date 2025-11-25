Write a program to find Sum of all prime numbers between the Given values.
import java.util.Scanner;
class prime9
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int sum=0;
        if(s<=0||e<=0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            for(int i=s+1;i<e;i++)
            {
                if(isPrime(i))
                {
                    sum=sum+i;
                }
            }
            if(sum==0)
            {
                System.out.println("No Prime Numbers");
                return;
            }
            else
            {
                System.out.println(sum);
            }
        }
    }
    static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

