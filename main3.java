Write a program to find sum of all the numbers in given range if starting index is greater than ending index print INVALID RANGE
import java.util.Scanner;
class Main3
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
            int sum=0;
            for(int i=start;i<=end;i++)
            {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}