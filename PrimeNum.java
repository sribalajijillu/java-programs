import java.util.*;
class PrimeNum {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=s.nextInt();
		int n=num/2;
		int flag=0;
		for(int i=2;i<=n;i++) {
			if(num%i==0) {
				System.out.println("Number is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Number is prime");
		}
	}
}