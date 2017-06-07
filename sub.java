import java.util.*;
class sub
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
int l=s.length();
int a[]=new int[l];
for(int t=0;t<l;t++)
{
for(int y=1;y<=l;y++)
{
a[t]=s.substring(t,t+y);
}
System.out.print(a[t]);
}
}
}
