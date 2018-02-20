import java.util.*;
class NestedIf
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter The Numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
if(a==13)
{
System.out.println("Add C & D:"+(c+d));
}
else if(b==13)
{
System.out.println("Add D & A:"+(d+a));
}
else if(c==13)
{
System.out.println("Add A & B:"+(a+b));
}
else if(d==13)
{
System.out.println("Add B & C:"+(b+c));
}
else 
{
System.out.println("Add all:"+(a+b+c+d));
}
}}