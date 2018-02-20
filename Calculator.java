import java.util.*;
class Calculator {
	public static void main(String args[]) {
		System.out.println("-----CAL MENU-----");
		System.out.println("\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Modulus");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice=s.nextInt();
		s.nextLine();
		System.out.println("Enter number 1:");
		int a=s.nextInt();
		s.nextLine();
		System.out.println("Enter number 2:");
		int b=s.nextInt();
		s.nextLine();
		switch(choice) {
			case 1:System.out.println("Addition:"+(a+b));break;
			case 2:System.out.println("Subtraction:"+(a-b));break;
			case 3:System.out.println("Multiplication:"+(a*b));break;
			case 4:System.out.println("Division:"+(a/b));break;
			case 5:System.out.println("Modulus:"+(a%b));break;
			default :System.out.println("Invalid choice:");
		}
	}
}