Write a program to print sum of squares of the numbers in given range .if starting range is Greater than ending range print "INVALID RANGE"
import java.util.Scanner;
class H
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int sum=0;
        if(s>e)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            for(int i=s;i<=e;i++)
            {
                sum+=i*i;
            }
            System.out.println(sum);
        }
    }
}