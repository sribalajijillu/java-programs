import java.util.*;
class DigitsPlace
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int place=1,a;
		//char[] ch=String.valueOf(num).toCharArray();
		//for(int i=0;i<ch.lenght;i++)
		while (num!=0)
		{
			a=num%10;
			System.out.println(a+" is in "+place+"'s place");
			place*=10;
			num/=10;
		}
	}
}	