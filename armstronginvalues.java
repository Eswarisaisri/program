Write a program to print the Alternative Armstrong Numbers between the Given Values?
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
    static boolean isArm(int n)
    {
        int dc=digc(n);
        int sum=0,t=n;
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
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        s=Math.abs(s);
        e=Math.abs(e);
        if(s==0||e==0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            if(s>e)
            {
                s=s+e-(e=s);
            }
            for(int i=s+1;i<e;i++)
            {
                if(isArm(i))
                {
                    c++;
                        if(c%2==1)
                        {
                            if(c==1)
                            {
                                System.out.print("Alternative Armstrong Numbers between the Given Values is ");
                            }
                            if(c!=1)
                            {
                                System.out.print(", ");
                            }
                            System.out.print(i);
                        }
                }
            }
                if(c==0)
                {
                    System.out.print("No Armstrong Numbers Between Given Values.");
                }
                else
                {
                    System.out.print(".");
                }
            
        }
    }
}