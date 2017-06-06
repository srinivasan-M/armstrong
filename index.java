import java.util.*;
class index{
public static void main(String args[]){
int[] a=new int[args.length];
for(int i=0;i<args.length;i++){
a[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int j=0;j<a.length;j++)
{
int k=0;
if(a[j]==j)
{
k=a[j];
}
System.out.println(a[j]+"->"+k);
}
}
}
