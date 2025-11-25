Write a Program to Print the following series 2*3,3*4,4*5,......16*17   (Print in two ways – Pattern & Multiplied value) .
import java.util.Scanner;
class G
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        if(start>end)
        {
            start=start+end-(end=start);
        }
        for(int i=start;i<=end;i++)
        {
            System.out.print(i+"*"+(i+1));;
            
            if(i<end)
            {
                System.out.print(", ");
            }
            if(i==end)
            {
            System.out.print("\n");
            }
        }
        
        //System.out.println(" ");
        for(int i=start;i<=end;i++)
        {
            System.out.print((i*(i+1)));
            if(i<end)
            {
                System.out.print(", ");
            }
        }
    }
}