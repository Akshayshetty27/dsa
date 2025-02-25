import java.util.Arrays;
class Subarr{
    public static int[] find_subarr(int arr[],int target)
    {
        
        for( int i=0;i<arr.length;i++ )
        {
            int sum =0;

            for( int j=i ; j< arr.length - 1 ;j++)
            {
                sum += arr[j];
                if( sum == target)
                {
                    return Arrays.copyOfRange(arr , i , j+1);
                }
            }
        }
        return null;
    }

    public static void main(String args[])
    {
        int sum =10;


        int arr[]={ 3,4,5,2,3,1,-5};
       System.out.println(Arrays.toString (find_subarr(arr,sum)));
    }
}