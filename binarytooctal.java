Write a program to Convert the Binary number to Octal number.
import java.util.Scanner;
class binarytoocatal
{
	public static void main(String[]args)
	{
		//Write your code here.c
		Scanner sc=new Scanner(System.in);
		String bin=sc.next();
		int dec=bintodec(bin);
		if(dec<0)
		{
		    System.out.print("Invalid InPut");
		}
		else
		{
		    String oct=dectooct(dec);
		    System.out.print(oct);
		}
	}
	static int bintodec(String bin)
	{
	    int c=0,dec=0;
	    for(int i=bin.length()-1;i>=0;i--)
	    {
	        char ch=bin.charAt(i);
	        if(ch>='0'&&ch<='1')
	        {
	            int val=(int)ch-48;
	            int po=(int)Math.pow(2,c);
	            c++;
	            dec=dec+po*val;
	        }
	        else
	        {
	            return-1;
	        }
	    }return dec;
	}
	static String dectooct(int dec)
	{
	    String oct="";
	    do
	    {
	        int r=dec%8;
	        oct=r+oct;
	        dec=dec/8;
	    }while(dec>0);
	    return oct;
	}
}