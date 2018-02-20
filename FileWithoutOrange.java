import java.util.*;
import java.io.*;
class FileWithoutOrange
{
	public static void main(String[] aa)
	{
		try { 
		FileOutputStream fout=new FileOutputStream("E:\\Program\\Fruits.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=s.nextInt();
		s.nextLine();
		String[] fruitNames=new String[n];
		System.out.println("Enter Fruit Orange in any case");
		String s1=s.nextLine();
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);
		System.out.println("Enter Fruit Names");
		for(int i=0;i<fruitNames.length;i++)
		{
			fruitNames[i]=s.nextLine();
			if(fruitNames[i].equals(s1lower))
			{
				System.out.println("File doesn't accept orange");
				//break;
			}
			else
			{
				byte b[]=fruitNames[i].getBytes();
				fout.write(b);
			}
		}
		fout.close();
		System.out.println("Written Successfully");
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
}
			