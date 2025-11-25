Write a program to print All the Prime Numbers between the Given Range.
import java.util.Scanner;
class prime10
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        if(s==0||e<=0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            for(int i=s;i<=e;i++)
            {
                if(isPrime(i))
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                }
            }
            if(c==0)
            {
                System.out.print("No Prime Numbers");
            }
        }
        
    }
    static boolean isPrime(int n)
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