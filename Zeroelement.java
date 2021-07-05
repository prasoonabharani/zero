import java.util.*;
class Zeroelement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,i,temp=0;
System.out.println("Enter Array size=");
size= sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter Array elements=");
for( i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
if(arr[i]!=0)
{
System.out.println(arr[i]+" ");
}
else
{
temp++;
}
}
for(i=0;i<temp;i++)
{
System.out.print("0");
}}}
