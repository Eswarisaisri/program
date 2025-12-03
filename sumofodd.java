Write a Program to Print Sum of all odd Positions in a Given Number?
If the Input is 5432 then print output as 6.
import java.util.Scanner;
class sumofodd
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int position=1;
        if(n<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            while(n>0)
            {
                long digit=n%10;
                if(position%2!=0)
                {
                    sum+=digit;
                }
                n/=10;
                position++;
            }
            System.out.println(sum);
        }
    }
}


