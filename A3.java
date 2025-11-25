Write program to print the following series which is shown in Given Examples.
Example:
Input 1  :    10

                  -12

Output 1:    

5*10, 5*9, 5*8, 5*7, 5*6, 5*5, 5*4, 5*3, 5*2, 5*1, 5*0, 5*(-1), 5*(-2), 5*(-3), 5*(-4), 5*(-5), 5*(-6), 5*(-7), 5*(-8), 5*(-9), 5*(-10), 5*(-11), 5*(-12)

 

 

Input 2  :    -6

                  8

Output 2:     5*(-6), 5*(-5), 5*(-4), 5*(-3), 5*(-2), 5*(-1), 5*0, 5*1, 5*2, 5*3, 5*4, 5*5, 5*6, 5*7, 5*8

 

Input 3  :    5

                  8

Output 3:    5*5, 5*6, 5*7, 5*8
import java.util.Scanner;
class A3
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
                    System.out.print("5*"+"("+(i)+")" );
                }
                else
                {
                    System.out.print("5*"+i);
                    
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
                    System.out.print("5*"+"("+(j)+")");
                }
                else
                {
                    System.out.print("5*" +j);
                }
            }
        }
    }
}