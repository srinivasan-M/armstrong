import java.util.*;
class no2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=0;i<=n;i++)
{
String s=String.valueOf(i);
if(s.contains("2"))
{
count++;
}
}
System.out.print(count);
}
}
