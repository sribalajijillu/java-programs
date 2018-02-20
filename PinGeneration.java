import java.util.*;
class PinGeneration {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		s.nextLine();
		int a,sum=0;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		char[] ch=name.toCharArray();
		char u=Character.toUpperCase(ch[0]);
		String symbol[]={"!","@","#","$","%","^","&","*","?","|"};
		while(num>0) {
			while(num!=0) {
				a=num%10;
				sum=sum+a;
				num/=10;
			}
			if(sum>=10) {
				num=sum;
				sum=0;
			}
		}
		System.out.println("Generated PIN:"+sum+""+u+""+ch[ch.length-1]+""+symbol[sum]);
	}
}