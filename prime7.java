Write a program to find Average of all Alternative Prime Numbers between Given Values.
import java.util.Scanner;
class prime7
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(s<=0 || e<=0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            double sum=0;
            int c=0;
            int d=0;
            int temp;
            if(e<s)
            {
                temp=s;
                s=e;
                e=temp;
            }
            for(int i=s+1;i<e;i++)
            {
                if(isPrime(i))
                {
                    c++;
                    if(c%2==1)
                    {
                        d++;
                        sum=sum+i;
                    }
                }
            }
            if(c==0)
            {
                System.out.print("No Prime Numbers");
            }
            else
            {
                System.out.printf("%.3f",(float)sum/d);
            }
        }
    }
    static boolean isPrime(int n)
    {
        if(n<1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}