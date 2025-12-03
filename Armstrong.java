Write a program to check Whether the Given Number(any number of digits) is Armstrong or Not.
import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(isarm(a))
            {
                System.out.println(a+ " is a Armstrong Number.");
            }
            else
            {
                System.out.println(a+ " is Not a Armstrong Number.");
            }
        }
    }
    static int digc(int n)
    {
        int dc=0;
        while(n>0)
        {
            int r=n%10;
            dc++;
            n=n/10;
        }
        return dc;
    }
    static boolean isarm(int n)
    {
        int dc=digc(n);
        int sum=0,t=n;
        while(t>0)
        {
            int r=t%10;
            int po=(int)Math.pow(r,dc);
            sum=sum+po;
            t=t/10;
        }
        return n==sum;
    }
}
