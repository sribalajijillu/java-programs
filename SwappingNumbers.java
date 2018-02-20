import java.util.*;
class SwappingNumbers {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=s.nextInt();
		s.nextLine();
		System.out.println("Enter number 2:");
		int b=s.nextInt();
		s.nextLine();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped Numbers"+" "+a+" "+b);
	}
}


