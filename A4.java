Write program to print the following series which is shown in Given Examples.
Example:
Input 1  :    10

Output 1:    1, 2, factor of three, 4, 5, factor of three, 7, 8, factor of three, 10

 

Input 2  :    24

Output 2:    1, 2, factor of three, 4, 5, factor of three, 7, 8, factor of three, 10, 11, factor of three, 13, 14, factor of three, 16, 17, factor of three, 19, 20, factor of three, 22, 23, factor of three.
import java.util.Scanner;
class A4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                c++;
                if(c!=1)
                {
                    System.out.print(", ");
                }
                System.out.print("factor of three");
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