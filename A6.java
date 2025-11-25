Write program to print the following series which is shown in Given Examples.
Example:
Input 1  :    36

Output 1:    1, even, 3, even, 5, even, 7, even, 9, even, 11, even, 13, even, 15, even, 17, even, 19, even, 21, even, 23, even, 25, even, 27, even, 29, even, 31, even, 33, even, 35, even

 

Input 2  :    9

Output 2:    1, even, 3, even, 5, even, 7, even, 9
import java.util.Scanner;
class A6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print("even");
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