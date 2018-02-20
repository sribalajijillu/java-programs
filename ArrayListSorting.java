import java.util.*;
public class ArrayListSorting
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String[] name=new String[5];
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Enter Name"+(i+1));
			name[i]=s.nextLine();
			al.add(name[i]);
		}
		System.out.println("Before Sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After Sorting");		
		// Using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}