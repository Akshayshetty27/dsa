import java.util.Scanner;
import java.util.Arrays;
class MaxNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={3,4,5,1,8,9};
        System.out.println(" enter the number of digit \n");
        int k = sc.nextInt();

        StringBuilder maxnum = new StringBuilder();
        if( k > arr.length)
        {
            System.out.println(" the size of number of digit is more as the number is to be created without repetetion ");
        }

        Arrays.sort( arr);
        for( int i=arr.length -1 ; i >= arr.length - k ; i-- )
        {
            maxnum.append(arr[i]);
        }

        System.out.println(" the maximum number that can be created is "+ maxnum.toString());


            }
}