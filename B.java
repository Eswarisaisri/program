Write a program to print sum of all even numbers in between the Given Numbers if no even numbers print NO NUMBERS if starting range is greater than ending range then print INVALID RANGE
import java.util.Scanner;
class B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int sum=0;
        int c=0;
        if(n>n1)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            for(int i=n+1;i<=n1-1;i++)
            {
                if(i%2==0)
                {
                    sum=sum+i;
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("NO NUMBERS");
            }
            else
            {
                System.out.println(sum);
            }
            
        }
    }
}
