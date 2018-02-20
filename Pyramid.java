class Pyramid
{
public static void main(String a[])
{
for(int i=0;i<3;i++)
{
for(int j=2;j>i;j--)
{
System.out.print(" ");
}
for(int k=0;k<=2*i;k++)
{
System.out.print("*");
}
System.out.println();
}}}