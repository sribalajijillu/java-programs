import java.util.*;
class SwitchCase
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String symbol;
System.out.println("Enter A:");
int a=s.nextInt();
System.out.println("Enter B:");
int b=s.nextInt();
System.out.println("Enter the Symbol:");
symbol=s.next();
switch(symbol)
{
case "+":System.out.println("Addition:"+(a+b));break;
case "-":System.out.println("Subtraction:"+(a-b));break;
case "*":System.out.println("Multiplication:"+(a*b));break;
case "/":System.out.println("Division:"+(a/b));break;
case "%":System.out.println("Modulus:"+(a%b));break;
default :System.out.println("Invalid Symbol:");
}
}}