Write a Program to Print Sum of the even digits in a Given Number?
If your input is 212 then you have to Print 4 as Output.
import java.util.Scanner;
class sumofeven
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
                System.out.println(sumdig(n));

        }
    }
    static int sumdig(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            if(r%2==0)
            {
                sum=sum+r;
            }
            n=n/10;
        }
        return sum;
    }
}