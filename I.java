Write a program to find the average of all even numbers in the given range.if the strating range is Greater than ending range then print 

"INVALID RANGE"
import java.util.Scanner;
class I
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int sum=0;
        int count=0;
        if(s>e)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            for(int i=s;i<=e;i++)
            {
                if(i%2==0)
                {
                    sum=sum+i;
                    count++;
                }
            }
            if(count>0)
            {
                double average=(double)sum/count;
                System.out.println(average);
            }
            else
            {
                System.out.println("No even number in range");
            }
        }
    }
}