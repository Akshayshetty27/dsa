//   introduction to  array   ( important)

import java.util.Scanner;
class array
{

    




public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,n;
n=sc.nextInt();
int [] arr= new int[n];
System.out.println(" enter the marks of "+n+" Subject");
for(i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
    }
    System.out.println(" the marks of th estudent are ");
    for(i=0;i<n;i++)
{
    System.out.println(" "+arr[i]);
    }
    System.out.println(" enter the searching element ");
    int ele= sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]==ele)
        {
            int pos=i+1;
            break;
        }
    }
System.out.println(" the searching element "+ele+" is at "+pos);
}
}
