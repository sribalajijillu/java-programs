import java.util.*;
class NameLength
{
public static void main(String args[])
{
String name;
Scanner s=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("Enter name");
name=s.next();
System.out.println("Name length="+name.length());
}
}}