Write a program to print all even numbers in range .if starting range is greater than ending range print "INVALID RANGE"
import java.util.Scanner;
class Main1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        if(start>end)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                if(i%2==0)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}