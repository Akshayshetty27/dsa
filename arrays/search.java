//   introduction to  array   ( important)

import java.util.Scanner;
class search
{

    




public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,n,pos=0;
n=sc.nextInt();
int [] arr= new int[n];
System.out.println(" enter the "+n+" elements");
for(i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
    }
    System.out.println(" the  elements  are ");
    for(i=0;i<n;i++)
{
    System.out.println(" "+arr[i]);
    }
    System.out.println(" enter the searching element ");
    int ele= sc.nextInt();
    for(i=0;i<arr.length;i++)
    {
        if(arr[i]==ele)
        {
            pos=i+1;
            break;
        }
        
    }
    if(pos==0)
        System.out.println(" the element not found");
else
 System.out.println(" the searching element "+ele+" is at "+pos);
}
}
