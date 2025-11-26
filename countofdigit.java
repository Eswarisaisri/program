Write a Program to Print Count no of Digits in a Given Number?
import java.util.Scanner;
class countofdigit
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("InvaliD Input");
            return;
        }
        else
        {
            int g=n;
            if(n<0)
            {
                n=-n;
            }
            int c=0;
            while(n>0)
            {
                int r=n%10;
                c++;
                n=n/10;
            }
            if(g<0&&c==1)
            {
                System.out.println("Given Number consists of only " +c+ " Digit and it is Negative Value.");
            }
            else if(g<0)
            {
                System.out.println("Given Number consists of " +  c + " Digits and it is Negative Value." );
            }
            else if(c==1)
            {
                System.out.println("Given Number consists of only 1 Digit.");
            }
            else
            {
                System.out.println("Given Number consists of " + c + " Digits.");
            }
        }
    }
}