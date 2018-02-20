import java.util.*;
class ArrayVowels
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String[] name=new String[5];
		ArrayList<String> vowels=new ArrayList<>();
		ArrayList<String> consonants=new ArrayList<>();
		//String[] vowel=new String[];
		//String[] consonant=new String[];
		System.out.println("Enter 5 Strings");
		for(int i=0;i<name.length;i++)
		{
			name[i]=s.nextLine();
			char[] ch=name[i].toCharArray();
			if((ch[0]=='a')||(ch[0]=='e')||(ch[0]=='i')||(ch[0]=='o')||(ch[0]=='u'))
			{
				//vowel[i]=name[i];
				vowels.add(name[i]);
			}
			else
			{
				//consonant[i]=name[i];
				consonants.add(name[i]);
			}
		}
		System.out.println("Array of Vowels:"+vowels);
		System.out.println("Array of Consonants:"+consonants);
		/*for(int i=0;i<vowel.length;i++)
		{
			System.out.print(vowel[i]+",");
		}
		System.out.println();
		for(int i=0;i<consonant.length;i++)
		{
			System.out.print(consonant[i]+",");
		}*/
	}
}
