import java.util.*;
class Palindrome {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String originalName=s.nextLine();
		String reversedName="";
	    char[] ch=originalName.toCharArray();
		for(int i= ch.length-1;i>=0;i--) {
			reversedName+=ch[i];
		}
		//String reversedName=String.valueOf(ch);
		if(originalName.equals(reversedName)) {
			System.out.println(originalName+" is a palindrome");
		}
		else {
			System.out.println(originalName+" is not a palindrome");
		}
	}
}