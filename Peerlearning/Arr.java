import java.util.Arrays;
class Arr
{
     public static void main(String args[] )
     {
        int arr[] = { 4,5,5,1,2,3,4};
        Arrays.sort(arr);

for( int i : arr)
System.out.println(i);
        for( int i=arr.length  - 2; i>1 ; i--)
        {
            if(arr[ i - 1 ] < arr[ i ] )
            {
                System.out.println("second highest : "+arr[i-  1 ]);
                System.exit(0);
            }
        }
        

     }
}