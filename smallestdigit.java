Write a Program to print the smallest digit in a Given Number?
import java.util.Scanner;
class smallestdigit
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int num=sc.nextInt();
        if(num<=0)
        {
            System.out.println("Invalid Input.");
        }
        else
        {
            int min=9;
            while(num>0)
            {
                int digit=num%10;
                if(digit<min)
                {
                    min=digit;
                }
                num/=10;
            }
            System.out.println("Smallest Digit in a Given Number is " + min + ".");
        }
    }
}