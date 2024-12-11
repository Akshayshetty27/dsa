import java.util.*;
class arr{
// finding whether arr is subset of another array
    public static int subsetornot(int arr[], int arr2[],int count)
    {
  for( int i : arr2)
        {
            for(int j=0;j<arr.length;j++)
            {
                if( i == arr[j])
                {
                    count ++;
                }
            }
        }

        return count;
    }
// sorting 
    public static void sort(int arr[])
    {
        for(int i=0; i< arr.length;i++)
        {
            for( int j=i;j<arr.length-1-i ;j++)
            {
                if( arr[j] >arr[j+1] )
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i : arr)
        {
            System.out.print(" "+i);
        }
    }

      public static int max3sum(int arr[])
    {
        int sum=0;
        if( arr.length < 3)
        {
            return -1;
        }
        sort(arr);
        sum= arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3];
        int avg= sum/3;
return avg ;
    }
    public static void main(String args[])
    {
        int arr[]= {3,9};
        int arr2[]={2,3};

      int counter=subsetornot(arr,arr2,0);
        if( counter== arr2.length)
        {
        System.out.println(" the arr2 is sub set of array 1");
        }else
        {
                    System.out.println(" the arr2 is not a sub set of array 1");
        }

        // Arrays
       // sort(arr);
       int res=max3sum(arr);
    
       System.out.println("\n the maximumm 3 sum :"+res);
    }

  

    
}