import java.util.*;
class no1
{
public static void main(String argS[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
}
}
