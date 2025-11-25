Write a program to find Average of all Prime Numbers between the Given Values. (Print the value upto 3 digits after Decimal Point)

import java.util.Scanner;
class prime2
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(s>0&&e>0)
        {
        double sum=0;
        int c=0;
        for(int i=s+1;i<e;i++)
        {
            if(isprime(i))
            {
                sum=sum+i;
                c++;
            }
        }
        System.out.printf("%.3f",(float)sum/c);
        }
        else
        {
            System.out.println("Invalid Inputs");
        }
    }
    static boolean isprime(int n)
    {
        if(n<=1)
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