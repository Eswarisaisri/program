Write program to print the following series which is shown in Given Examples
Example:
Input 1  :    10

                  31

Output 1:    10^2, 12^2, 14^2, 16^2, 18^2, 20^2, 22^2, 24^2, 26^2, 28^2, 30^2

 

Input 2  :    -6

                  8

Output 2:     Invalid Inputs

 

Input 3  :    5

                  27

Output 3:    5^2, 7^2, 9^2, 11^2, 13^2, 15^2, 17^2, 19^2, 21^2, 23^2, 25^2, 27^2
import java.util.Scanner;
class A2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        if(a<0||b<0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            for(int d=a;d<=b;d+=2)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print(d+"^2");
            }
        }
    }
}