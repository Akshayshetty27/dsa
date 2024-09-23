import java.util.Scanner;
class arrayswap
{
    public static void main(String args[])
    {
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of elments");
int n= sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
  arr[i]=sc.nextInt();        

System.err.println("clock-wise array rotation ");
int temp=arr[n-1];
for(int j=n-1;j> 0;j--)
 arr[j]=arr[j-1];
arr[0]=temp;
for(int j=0;j<n;j++)
 System.out.print(" "+arr[j]);

System.err.println("\ngcdanti clock-wise  array rotation ");
temp=arr[0];
for(int j=0;j<n-1;j++)
 arr[j]=arr[j+1]; 
System.out.println(" ");
arr[n-1]=temp;
for(int j=0;j<n;j++)
 System.out.print(" "+arr[j]);

}
}