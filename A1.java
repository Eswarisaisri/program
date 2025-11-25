Write program to print the following series which is shown in Given Examples.
Example:
Input 1   : 100

                1000

Output 1 : 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000

 

Input 2   : 300

                2500

Output 2 : 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100, 2200, 2300, 2400, 2500

 import java.util.Scanner;
class A1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        if(s<=0||e<=0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            for(int a=s;a<=e;a+=100)
            {
                if(a%100==0)
                {
                    c++;
                    if(c!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(a);
                }
            }
        }
        
    }
}
Te
