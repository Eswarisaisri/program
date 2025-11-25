Write a program to print Alternative Prime Numbers between the Given Range.
import java.util.Scanner;
class prime6
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        if(s<=0||e<=0)
        {
            System.out.println("Invalid Inputs");
            return;
        }
        if(s>e)
        {
            int temp=e;
            s=e;
            e=temp;
        }
        for(int i=s;i<=e;i++)
        {
            if(isPrime(i))
            {
                c++;
                if(c%2==1)
                {
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                }
                
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