import java.util.*;
class UserMainCode
{
	static int getSumMaxMin(int a,int b,int c)
	{
		int sum,maxNum,minNum;
		if(a>b && a>c)
		{ 
			maxNum=a; 
		}
		else if(b>a && b>c)
		{
			maxNum=b;
		}
		else
		{
			maxNum=c;
		}
		if(a<b && a<c)
		{
			minNum=a;
		}
		else if(b<a && b<c)
		{
			minNum=b;
		}
		else
		{
			minNum=c;
		}
		sum=maxNum+minNum;
		return sum;
		//System.out.println("Sum of Max and Min"+" "+sum);
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		System.out.println("Sum of Max and Min"+" "+UserMainCode.getSumMaxMin(x,y,z));
	}
}