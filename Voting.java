import java.util.*;
class Voting
{
public static void main(String args[])
{
int i=0;
int sage;
String sname;
Scanner s=new Scanner(System.in);
while(i<10)
{
System.out.println("Enter Age");
sage=s.nextInt();
System.out.println("Enter name");
sname=s.next();
if(sage+3>=18)
{
System.out.println(sname+" is eligible for voting");
}
else
{
System.out.println(sname+" is not eligible for voting");
}
i++;
}}}
