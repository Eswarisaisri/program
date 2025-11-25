-->Write a program to print CVCORP for 'N' times
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<10||n>100)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                System.out.println("CVCORP");
            }
        }
    }
}