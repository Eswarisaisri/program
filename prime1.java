Write a program to print all Prime Factors of a Given Number?
import java.util.Scanner;
class prime1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sum=0;
        int c=0;
        if(s==0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=1;i<=Math.abs(s);i++)
            {
                if(s%i==0)
                {
                    if(isprime(i))
                    {
                        c++;
                        System.out.print(i+" ");
                    }
                }
            }
            if(c==0)
            {
                System.out.println("No Prime Factors");
            }
        }
    }
    static boolean isprime(int n)
    {
        if(n<=1)
            return false;
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
