import java.util.*;
class armstrong
{
public static void main(String args[])
{
int i,temp,n,r;
Scanner ss=new Scanner(System.in);
int a=ss.nextInt();
int b=ss.nextInt();
for(i=a;i<=b;i++)
{
temp=i;
n=0;
while(temp!=0)
{
r=temp%10;
n+=r*r*r;
temp/=10;
}
if(i==n)
System.out.print(i);
}
}
}
