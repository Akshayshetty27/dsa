import java.util.Arrays;
class Arr
{
     public static void main(String args[] )
     {
        int arr[] = { 4,5,5,1,2,3,4};
        Arrays.sort(arr);

        for( int i=1; i< arr.length ; i++)
        {
            if(arr[i] < arr[i - 1] )
            {
                System.out.println(" "+arr[i]);
                System.exit(0);
            }
        }
        

     }
}