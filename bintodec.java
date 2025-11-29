Write a program to Convert the Binary number to Decimal number?
import java.util.Scanner;
class bintodec
{
	public static void main(String[]args)
	{
		//write your code here.
		Scanner sc=new Scanner(System.in);
		String bin=sc.next();
		int result=bintodec(bin);
		if(result==-1)
		{
		    System.out.print("InvAlid Input.");
		}
		else
		{
		    System.out.print(result);
		}
	}
	static int bintodec(String bin)
	{
	    int c=0,dec=0;
	    for(int i=bin.length()-1;i>=0;i--)
	    {
	        char ch=bin.charAt(i);
	        int val=(int)ch-48;
	        if(val!=0&&val!=1)
	        {
	            return -1;
	        }
	        else
	        {
	            int po=(int)Math.pow(2,c);
	            c++;
	            dec+=po*val;
	        }
	    }return dec;
	}
}