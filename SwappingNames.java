import java.util.*;
class SwappingNames {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name 1");
		String name1=s.nextLine();
		System.out.println("Enter Name 2:");
		String name2=s.nextLine();
		/*char[] ch1=name1.toCharArray();
		char[] ch2=name2.toCharArray();
		name1=String.valueOf(ch2);
		name2=String.valueOf(ch1);*/
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length());
		name1=name1.substring(name2.length());
		System.out.println("Swapped Names"+" "+name1+" "+name2);
	}
}
