Write a program to convert temperature from degree celcisu (C) to Farenheit (F)
import java.util.Scanner;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int celsius=sc.nextInt();
        double fahrenheit=(celsius*9/5.0)+32;
        System.out.println(fahrenheit+"F");
    }
}