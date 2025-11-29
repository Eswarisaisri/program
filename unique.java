Write a program to print the Least Unique Numbers In A given Array?
import java.util.Scanner;
class unique
{
    public static void main(String[]args)
    {
        //write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=5)
        {
            System.out.println("Invalid Array Size");
        }
        else
        {
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            int c=0;
            for(int i=0;i<n;i++)
            {
                int oc=0;
                
                for(int j=0;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        oc++;
                    }
                }
                if(oc==1)
                {
                    if(a[i]<min)
                    {
                        min=a[i];
                        c++;
                    }
                }
            }
            if(c==0)
            {
                System.out.print("No Uniques in the Array");
            }
            else
            {
                System.out.print(min);
            }
        }
    }
}