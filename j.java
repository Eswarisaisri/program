Write a program to print all alternative even numbers in the given range if no numbers then print NO NUMBERS if starting range is greater than ending range print INVALID INPUTS

import java.util.Scanner;
class J
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        boolean found=false;
        if(s>e)
        {
            System.out.println("INVALID INPUTS");
        }
        else
        {
            for (int i=s;i<=e;i++)
            {
                if(i%2==0)
                {
                    c++;
                    if(c%2==1)
                    {
                        if(c!=1)
                        {
                            System.out.print(" ");
                            found=true;
                        }
                        System.out.print(i);
                    }
                }
            }
            if(!found)
            {
                System.out.println("NO NUMBERS");
            }
        }
    }
}