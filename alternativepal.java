Write a program to print Alternative Palindrome Numbers in the Given Range?
import java.util.Scanner;
class alternativepal
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<0||b<0)
        {
            System.out.println("InvAlid InPUts");
        }
        else
        {
            int alt=0;
            int c=0;
            int d=0;
            for(int i=a;i<=b;i++)
            {
                int temp=i;int rev=0;
                while(temp>0)
                {
                    int r=temp%10;
                    rev=rev*10+r;
                    temp=temp/10;
                }
                if(rev==i)
                {
                    alt++;
                    if(alt%2==1)
                    {
                        if(c==0)
                        {
                            System.out.print(rev);
                            d++;
                            c++;
                        }
                        else
                        {
                            System.out.print(", "+rev);
                        }
                    }
                }
            }
            if(d!=0)
            {
                System.out.print(".");
            }
            else
            {
                System.out.print("No Palindrome Values");
            }
        }
        
    }
}