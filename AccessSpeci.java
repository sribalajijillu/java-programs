import java.util.*;
class AccessSpeci
{
public static int b;
protected static int c;
private static int d;
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("Enter A:");
a=s.nextInt();
System.out.println("Enter B:");
b=s.nextInt();
System.out.println("Enter C:");
c=s.nextInt();
System.out.println("Enter D:");
d=s.nextInt();
System.out.println("Addition:"+(a+b));
System.out.println("Subtraction:"+(b-c));
System.out.println("Multiplication:"+(c*d));
System.out.println("Division:"+(a/c));
System.out.println("Modulus:"+(b%d));
}}
