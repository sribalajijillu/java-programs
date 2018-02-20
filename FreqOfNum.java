import java.util.*;
class FreqOfNum {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int mod;
		int a[]=new  int[10];
		for(int i=0;i<10;i++) {
			a[i]=0;
		}
		while(num>0) {
			mod=num%10;
			a[mod]++;
			num=num/10;
		}
		for(int i=0;i<10;i++) {
			if(a[i]!=0) {
				System.out.println("Frequence of "+i+" is "+a[i]);
			}
		}
	}
}