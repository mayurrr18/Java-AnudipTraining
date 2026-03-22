import java.util.Scanner;
class marks
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number: ");
a=sc.nextInt();
if(a>=80)
{
System.out.println("a is first class");}
else if (a>=60)
{
System.out.println("a is second class");}
else if(a>=40)
{
System.out.println("is normal");
}
    else {
    System.out.println("is fail");}
}}