import java.util.*;
class sd
{
public static void main(String argS[])
{
	int t=0;

String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter the str no");
s=sc.nextLine();
String a[]=s.split("\\s.");
for (int i=0;i<a.length;i++)
{
t++;
}System.out.print(t);
}}
