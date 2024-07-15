import java.util.Scanner;
class bbble{
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

System.out.println(" Bubble  sorting ");
for(i=0;i<n-1;i++)
{
    for(j=0;j<n-i-1;j++)
    {
        if(arr[j]>arr[j+1])
        {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
                    }
    }
}
System.out.println(" the sorted array is ");
for(i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}

    }
    
}