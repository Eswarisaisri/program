Write a program to print all numbers which are divisible by 11 in given range if no such numbers print NO NUMBERS if starting range is greater than ending range then print INVALID RANGE
import java.util.Scanner;
class Method6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            boolean found=false;
            for(int i=a;i<=b;i++)
            {
                if(i%11==0)
                {
                    System.out.print(i+ " ");
                    found=true;
                }
            }
            if(!found)
            {
                System.out.print("NO NUMBERS");
            }
        }
        
        
    }
}