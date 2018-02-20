import java.util.*;
class DuplicateWithCount
{
public static void main(String h[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Name:");
String name=s.nextLine();
int count=0;
char[] a=name.toCharArray();
for(int i=0;i<name.length();i++) 
{
for(int j=i+1;j<name.length();j++) 
{
if(a[i]==a[j]) {
char b=Character.toUpperCase(a[i]);
System.out.println("Duplicate Letter:"+b);
count++;
break;
}
}
}
System.out.println("No. of Duplicate letters:"+count);
} 
} 