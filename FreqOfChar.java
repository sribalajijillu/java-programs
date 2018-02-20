import java.util.*;
class FreqOfChar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String Name=s.nextLine();
		char ch;
		int count=0;
		for(char i='a';i<='z';i++) 
		{
			count=0;
			for(int j=0;j<Name.length();j++)
			{
				ch=Name.charAt(j);
				if(ch==i)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println("Frequency of Character "+i+" is "+count);
			}
		}
	}
}ss