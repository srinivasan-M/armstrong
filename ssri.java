import java.util.*;
import java.io.*;
class ssri
{

public static void main(String args[])

{

Scanner ss=new Scanner(System.in);

int n=ss.nextInt();
int a=n;
int sum=1;
while(n!=0)
{
int t=n%10;
sum=sum*t;
n=n/10;
}
System.out.print(sum*a);

}
}
