Write a program to print the Armstrong Numbers in the Given Range.
import java.util.Scanner;
class Main
{
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
        int t=n,sum=0;
        while(n>0)
        {
            int r=n%10;
            int po=(int)Math.pow(r,dc);
            sum=sum+po;
            n=n/10;
        }
        return sum==t;
    }
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        if(s<=0||e<=0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            if(s>e)
            {
                s=s+e-(e=s);
            }
            for(int i=s;i<=e;i++)
            {
                if(isarm(i))
                {
                    c++;
                    if(c==1)
                    {
                        System.out.print("Armstrong Numbers in the Given Range is ");
                    }
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                }
            }
            if(c==0)
            {
                System.out.print("No Armstrong Numbers");
            }
            else
            {
                System.out.print(".");
            }
        }
    }
}
