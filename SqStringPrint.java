import java.util.*;
class SqStringPrint
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter All Strings Length");
		int length=s.nextInt();
		s.nextLine();
		System.out.println("Enter String 1");
		String s1=s.nextLine();
		char[] ch1=s1.toCharArray();
		System.out.println("Enter String 2");
		String s2=s.nextLine();
		char[] ch2=s2.toCharArray();
		System.out.println("Enter String 3");
		String s3=s.nextLine();
		char[] ch3=s3.toCharArray();
		System.out.println("Enter String 4");
		String s4=s.nextLine();
		char[] ch4=s4.toCharArray();
		int i;
		for (i=0;i<length;i++)
		{
			System.out.print(ch1[i]);
		}
		//System.out.println();	
		if((ch1[length-1]==ch3[0]) && (ch4[length-1]==ch3[length-1]) && (ch1[0]==ch2[0]))
		{
			for(i=1;i<length-1;i++)
			{
				System.out.print("\n"+ch2[i]+"   "+ch3[i]);
			}
		}
		/*if(ch1[0]==ch2[0])
		{
			for(i=1;i<length;i++)
			{
				System.out.print("\n"+ch2[i]);
			}
		}*/
		System.out.println();
		if(ch2[length-1]==ch4[0])
		{
			for(i=0;i<length;i++)
			{
				System.out.print(ch4[i]);
			}
		}
		/*if((ch1[length-1]==ch3[0]) && (ch4[length-1]==ch3[length-1]))
		{
			for(i=2;i<length-1;i++)
			{
				System.out.print(ch3[i]);
			}
		}*/
	}
}