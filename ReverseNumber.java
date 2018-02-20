import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
int num=s.nextInt();
int a,b=0;
while(num !=0)
{
a=num%10;
b=b*10+a;
num/=10;
}
System.out.println("Reversed Number:"+b);
}}
