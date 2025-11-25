Write a Program to Print the Alternative Even Numbers Between the Given Numbers?
import java.util.Scanner;
class D
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        if(a<=0||b<=0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=a+1;i<=b-1;i++)
            {
                if(i%2==0)
                {
                    c++;
                    if(c%2==1)
                    {
                        System.out.print(i+ " ");
                    }
                }
            }
        }
    }
}