import java.util.*;
class FreqOfVowels
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String name=s.nextLine();
		String nameLower=name.toLowerCase();
		char[] ch=nameLower.toCharArray();
		int count=0;
		int i;
		int vowels=0;
		int consonants=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			count++;
		}
		System.out.println("Freq of "+'a'+" is "+count);
		count=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='e')
			count++;
		}
		System.out.println("Freq of "+'e'+" is "+count);
		count=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='i')
			count++;
		}
		System.out.println("Freq of "+'i'+" is "+count);
		count=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='o')
			count++;
		}
		System.out.println("Freq of "+'o'+" is "+count);
		count=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='u') 
			count++; 
		}
		System.out.println("Freq of "+'u'+" is "+count);
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			vowels++;
			}
			else {
			consonants++;
			}
		}		
		System.out.println("Total No. of Vowels:"+vowels);
		System.out.println("Total No. of Consonants:"+consonants);
	}
}