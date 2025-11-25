Write a program to find Sum of first 'n' Natural Numbers Without Using formula?
import java.util.Scanner;
class prime3
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n==0)
        {
            System.out.println("InvaLid Input.");
        }
        else if(n<0)
        {
            System.out.println("Sorry! you have Entered Negative Values.");
        }
        else
        {
            int c=0;
            System.out.print("Sum of 'N' Natural Numbers is ");
            for(int i=1;i<=n;i++)
            {
               sum=sum+i;
               c++;
               if(c==1)
               {
                   System.out.print(i);
               }
               else
               System.out.print(" + "+i);
            }

            System.out.print(" = "+sum+".");
        }
    }
}