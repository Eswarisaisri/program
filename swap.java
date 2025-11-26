Write a program to swap Given two numbers.
import java.util.Scanner;
class swap
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
