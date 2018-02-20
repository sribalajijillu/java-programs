import java.util.*;
class Fibonacci {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int a0=0,a1=1,a2;
		System.out.print(a0+" "+a1+" "); // print 0 and 1
		for(int i=0;i<=n;i++) {
			a2=a0+a1;
			a0=a1;
			a1=a2;
			System.out.print(a2+" ");
		}
	}
}