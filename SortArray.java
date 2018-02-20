import java.util.*;
class SortArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String[] name=new String[5];
		int i,j;
		String temp;
		for(i=0;i<name.length;i++)
		{	
			System.out.println("Enter Name "+(i+1));
			name[i]=s.nextLine();
		}
		for(i=0;i<name.length;i++)
		{
			for(j=i+1;j<name.length;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		System.out.println("After Sorting in Ascending order");
		for(i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		/*Arrays.sort(name);
		System.out.println("After Sorting");
		for(i=0;i<5;i++)
		{
			System.out.println(name[i]);
		}
		Arrays.sort(name,Collections.reverseOrder());
		System.out.println("After Sorting in Descending order");
		for(i=0;i<5;i++)
		{
			System.out.println(name[i]);
		}*/
	}
}