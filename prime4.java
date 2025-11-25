Write a program to find the Sum of all Alternative Prime Numbers between Given Values.
import java.util.Scanner;
class prime4
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
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
                    if(c%2==0)
                    {
                        sum+=i;
                    }
                    c++;
                
                }
            }
            if(c==0)
            {
                System.out.println("No Prime Numbers");
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
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}


