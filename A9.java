Write program to print the following series which is shown in Given Examples.
Example:
Input 1  :    10

                  -12

Output 1:    

50, 45, 40, 35, 30, 25, 20, 15, 10, 5, 0, (-5), (-10), (-15), (-20), (-25), (-30), (-35), (-40), (-45), (-50), (-55), (-60)

 

Input 2  :    -6

                  8

Output 2:     (-30), (-25), (-20), (-15), (-10), (-5), 0, 5, 10, 15, 20, 25, 30, 35, 40

import java.util.Scanner;
class A9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        if(a>b)
        {
            for(int i=a;i>=b;i--)
            {
                
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                if(i<0)
                {
                    System.out.print("("+(i*5)+")");
                }
                else
                {
                    System.out.print(i*5);
                }
                
            }
        }
        else
        {
            for(int j=a;j<=b;j++)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                if(j<0)
                {
                    System.out.print("("+(5*j)+")");
                }
                else
                {
                    System.out.print(5*j);
                }
            }
        }
        
    }
}



