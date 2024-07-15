import java.util.Scanner;
class insertion{
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the nmber of elements in the array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int temp,i,j;
        System.out.println(" enter the elements for the array ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

System.out.println(" the array elements are ");
for(i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}
System.out.println(" insertion sort ");
for(i=1;i<arr.length;i++)
{
    int current=arr[i];
     j=i-1;
    while(j>=0 && current<arr[j])
    {
        arr[j+1]=arr[j];
        j--;
            }
            // placement
            arr[j+1]=current;

    
}




System.out.println(" the sorted array is ");
for(i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}

}
}