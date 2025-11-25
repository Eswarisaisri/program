Write a program to perform Addition, Subtraction, Multiplication and Division of 2 Numbers based on the user inputs by using Switch condition.(+ , - , * , /, %).
import java.util.Scanner;
class Main4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0)
                {
                    System.out.println(a/b);
                }
                else
                {
                    System.out.println("Division by zero error");
                }
                break;
            case '%':
                if(b!=0)
                {
                    System.out.println(a%b);
                }
                else
                {
                    System.out.println("Moduloby zero error");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}