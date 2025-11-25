Write a program to print following pattern 

if input is 10 and -5

output will be 10@9,9@8,8@7,7@6,6@5,5@4,4@3,3@2,2@1,1@0,0@-1,-1@-2,-2@-3,-3@-4,-4@-5,-5@-6

import java.util.Scanner;
class A8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        int i;
        if(a>b)
        {
            i=a;
            while(i>=b)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(",");
                }
                System.out.print(i + "@" +(i-1));
                i--;
            }
        }
        else
        {
            i=a;
            while(i<=b)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(",");
                }
                System.out.print(i+"@"+(i+1));
                i++;
            }
        }
    }
}