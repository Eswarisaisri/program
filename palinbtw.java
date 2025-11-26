Write a program to print all Palindrome Numbers between the Given Numbers?
import java.util.Scanner;
class palinbtw
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        if(s<0||e<0)
        {
            System.out.println("InvaliD InputS");
            return;
        }
          if(s>e)
        {
            int temp=s;
            s=e;
            e=temp;
            //System.out.println();
        }
            for(int i=s+1;i<e;i++)
            {
                if(ispal(i))
                {
                    c++;
                    System.out.println(i);
                }
            }
            if(c==0)
            {
                System.out.println("No Palindrome Values");
            }
    }
    static boolean ispal(int n)
    {
        int original=n;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return original==rev;
    }
}