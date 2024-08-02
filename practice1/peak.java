import java.util.Scanner;
class peak
{
    public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,n;
System.out.println(" enter the nmber of elments in the array ");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println(" enter "+n+" elements in the array \n");
for(i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
System.out.println(" the array elements are \n");
for(i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}
System.out.println();
int peak;
for(i=1;i<n-1;i++)
{
    if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
    {
        peak=arr[i];
        System.out.println(" the peak elemets is "+peak);
    }
}

}}