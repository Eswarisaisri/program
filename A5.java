Write program to print the following series which is shown in Given Examples.
Example:
Input 1  :    25

Output 1:     1, 3, divisible by five, 7, 9, 11, 13, divisible by five, 17, 19, 21, 23, divisible by five

 

Input 2  :    38

Output 2:    1, 3, divisible by five, 7, 9, 11, 13, divisible by five, 17, 19, 21, 23, divisible by five, 27, 29, 31, 33, divisible by five, 37
import java.util.Scanner;
class A5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i+=2)
        {
            if(i%5==0)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                   System.out.print("divisible by five");
            }
            else
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }
        
    }
}
