Write program to print the following series which is shown in Given Examples.
Example:
Input 1  :    10

Output 1:    5, 10, 5, 10, 5, 10, 5, 10, 5, 10

 

Input 2  :    -6

Output 2:     Invalid Input

 

Input 3  :    5

Output 3:    5, 10, 5, 10, 5
import java.util.Scanner;
class A7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        if(a<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=0;i<a;i++)
            {
                if(i%2==0)
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print("5");
                }
                else
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print("10");
                }
            }
        }
    }
}