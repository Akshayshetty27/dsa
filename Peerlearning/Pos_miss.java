import java.util.Arrays;

class Pos_miss
{
    public static void main(String args[])
    {
        int arr[]= { 1,2,4,-5,5};
        Arrays.sort(arr);

        for( int i=0 ; i< arr.length ; i++)
        {
            if( arr[i] > 0 && arr[i + 1 ] != arr[i] + 1)
            {
                System.out.println(arr[i]+1);
                System.exit(0);
            }
        }

    }
}