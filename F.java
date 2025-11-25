write a program to print all character by using char variable
import java.util.Scanner;
class F
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        for(char c=ch;c<=(ch<='Z'?'Z':'z');c++)
        {
            System.out.print(c+" ");
        }
    }
}