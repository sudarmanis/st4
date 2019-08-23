import java.util.*;
class fib
{
public static void main(String argS[])
{
int a=0,b=1,c,d;
Scanner sc=new Scanner(System.in);


c=sc.nextInt();
System.out.print(b+"");
for(int i=2;i<=c;i++)
{

d=a+b;
System.out.print(d);
a=b;
b=d;	
}
}}
