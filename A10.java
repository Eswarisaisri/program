Write program to print the following series which Given Examples.
Example:
Input 1  :    10.7

                  12.1

Output 1:    

10.7^2, 10.9^2, 11.1^2,11.3^2, 11.5^2, 11.7^2, 11.9^2, 12.1^2.

 
Input 2  :    6.1

                  8.9

Output 2:     6.1^2, 6.3^2, 6.5^2, 6.7^2, 6.9^2, 7.1^2, 7.3^2, 7.5^2, 7.7^2, 7.9^2, 8.1^2, 8.3^2, 8.5^2, 8.7^2, 8.9^2.
import java.util.Scanner;
class A10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float start=sc.nextFloat();
        float end=sc.nextFloat();
        int c=0;
        for(float i=start;i<=end;i+=0.2f)
        {
            c++;
            if(c==1)
            System.out.printf("%.1f^2",i);
            else
            System.out.printf(", %.1f^2",i);
        }
        System.out.print(".");
    }
}


