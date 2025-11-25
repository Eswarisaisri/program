Write a Program to Print the Biggest Number out of the Given three Numbers?
import java.util.Scanner;
class Main5
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int biggest=a;
        if(b>biggest)
        {
            biggest=b;
        }
        if(c>biggest)
        {
            biggest=c;
        }
        System.out.println(biggest + " is a Biggest Number from the Given Numbers");
    }
}
