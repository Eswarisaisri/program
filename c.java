Write a program to print A,B in given number of times alternatively
import java.util.Scanner;
class c
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            System.out.print("A,B");
            if(i<a-1)
            {
                System.out.print(",");
            }
        }
    }
}
