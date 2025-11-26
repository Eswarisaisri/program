Write a Program to Print Sum of the digits in a Given Number?
If your input is 210 then you have to Print 3 as Output.
import java.util.Scanner;
class sumofdigits
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        if(num<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            while(num!=0)
            {
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            System.out.println(sum);
        }
    }
}