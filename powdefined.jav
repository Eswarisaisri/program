Write a program to Calculate Power of a Number. (Without using Pre Defined Method)
import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(s<=0||e<=0)
        {
            System.out.println("Invalid Inputs");
            return;
        }
        int pow=ispow(s,e);
        System.out.println(s+" Power "+e+" value is "+pow+".");
    }
    static int ispow(int s,int e)
    {
        int result=1;
        for(int i=1;i<=e;i++)
        {
            result*=s;
        }
        return result;
    }
        
}
a