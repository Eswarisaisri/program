Write a program to the Given Number is Palindrome or not if it is palindrome then Print PALINDROME else Print Reverse Value of a Given Number ?

import java.util.Scanner;
class palindrome
{
    public static void main(String []args)
    {
        //Write your code heren
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int rev=reverse(i);
        if(i<0)
        {
            System.out.println("Invalid Input");
        }
        else if(i==0)
        {
            System.out.println("Zero");
        }
        else if(i==rev)
        {
            System.out.println("Given Number is Palindrome");
        }
        else
        {
            System.out.println("Reverse of a Given Number is " + rev);
        }
    }
    static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}
