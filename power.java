Write a program to Calculate Power of a Number. (With Pre Defined Method)
import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int p=sc.nextInt();
        int s=0;
        if(b<=0||p<=0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            s=(int)Math.pow(b,p);
            System.out.println(b+" Power "+p+" value is "+s+".");
        }
    }
}