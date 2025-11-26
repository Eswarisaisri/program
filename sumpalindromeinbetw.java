Write a program to find Sum of all Palindrome Numbers between the Given Numbers?
import java.util.Scanner;
class sumpalindromeinbetw
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;int c=0;
        a=Math.abs(a);
        b=Math.abs(b);
        int s=Math.min(a,b);
        int e=Math.max(a,b);
        if(a==0||b==0)
        {
            System.out.println("INVALID Inputs");
            return;
        }
        else
        {
            if(a>b)
            {
                a=a+b-(b=a);
            }
            for(int i=a+1;i<b;i++)
            {
                if(ispal(i))
                {
                    c++;
                    sum=sum+i;
                }
            }
            if(c==0)
            {
                System.out.println("No Palindrome Values");
            }
            else
            {
                System.out.println(sum);
            }
        }
        
    }
    static boolean ispal(int n)
    {
        int rev=0,temp=n;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        return rev==n;
    }
}