Write a program to Print the Reverse of a Given Number?

import java.util.Scanner;
class reverse
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        if(n<=0)
        {
            System.out.println("InValid Input");
        }
        else
        {
            while(n>0)
            {
                int r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            System.out.println(rev);
        }
    }
}