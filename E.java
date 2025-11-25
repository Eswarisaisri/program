Write a program to find the count of even numbers in given range.if no even numbers print NO NUMBERS if Strating range is greater than ending range print INVALID RANGE
import java.util.Scanner;
class E
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        if(a>b)
        {
            System.out.print("INVALID RANGE");
        }
        else
        {
            for(int i=a;i<=b;i++)
            {
                if(i%2==0)
                {
                    c++;
                }
                
            }
            if(c==0)
            {
                System.out.println("NO NUMBERS");
            }
            else
            {
                System.out.println(c);
            }
            
        }
    }
}