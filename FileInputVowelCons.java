import java.util.*;
import java.io.*;
class FileInputVowelCons
{
	public static void main(String[] aa)
	{
		try { 
		FileOutputStream fout1=new FileOutputStream("E:\\Program\\Vowels.txt");
		FileOutputStream fout2=new FileOutputStream("E:\\Program\\Consonants.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=s.nextInt();
		s.nextLine();
		String[] names=new String[n];
		System.out.println("Enter Names");
		for(int i=0;i<names.length;i++)
		{
			names[i]=s.nextLine();
			char[] ch=names[i].toCharArray();
			if((ch[0]=='a') ||(ch[0]=='e') ||(ch[0]=='i') ||(ch[0]=='o') ||(ch[0]=='u'))
			{
				//System.out.println(ch[0]);
				byte b[]=names[i].getBytes();
				fout1.write(b);
				//fout1.close();
			}
			else
			{
				//System.out.println(ch[0]);
				byte c[]=names[i].getBytes();
				fout2.write(c);
				//fout2.close();
			}
		}
		fout1.close();
		fout2.close();
		System.out.println("Written Successfully");
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
}