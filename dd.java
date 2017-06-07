import java.util.*;
class dd
{
public static void main(String args[])
{
LinkedList l=new LinkedList();
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
String s1=ss.nextLine();
char[] x=s.toCharArray();
char[] y=s1.toCharArray();
for(int i=0;i<x.length;i++)
{
int as=(int)x[i];
l.add(as+10);
}
Iterator itr=l.iterator();

while(itr.hasNext())
{
int a=(int)itr.next();
char b=(char)a;
System.out.print(b);
}



for(int j=0;j<y.length;j++)
{
int asc=(int)y[j];
l.add(asc);
}

while(itr.hasNext())
{
int g=(int)itr.next();
char h=(char)g;
System.out.print(h);
}
//System.out.print(l+" ");
}}
