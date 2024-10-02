import java.util.Scanner;
class selection
{
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
temp=0;
int smallest=0;
System.out.println(" selection sort ");
for(i=0;i<n-1;i++)
{
  smallest=i;
    for(j=i+1;j<n;j++)
    {
      if(arr[smallest]>arr[j])
      {
        smallest=j;
      }   
    
    }
    temp=arr[smallest];
    arr[smallest]=arr[i];
    arr[i]=temp;
    }


System.out.println(" the sorted array is ");
for(i=0;i<n;i++)
{
    System.out.print(" "+arr[i]);
}

}
}