import java.util.*;
class add
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int s=ss.nextInt();
char[] a=new char[s];
char[] b="abcdefghijklmnopqrstuvwxyz".tocharArray();
for(int i=0;i<s;i++)
{
a[i]=ss.nextInt();
}
for(int l=0;l<s;l++)
{
for(int j=a[l];j<s;j++)
{
a[j-1]=b[j-1];
}
System.out.println(
