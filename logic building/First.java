// 2. Recursively Reduce the Array
// Problem:
// Given an array of integers, recursively:

// Find the sum of adjacent elements

// Replace the array with the new array

// Repeat until one element remains
// Input: [1, 2, 3, 4]
// Step 1: [3, 5, 7]
// Step 2: [8, 12]
// Step 3: [20]
// Output: 20

class First
{
    public  static void   match( int arr[])
    {
        if( arr.length == 1)
        {
            System.out.println(" "+arr[0] );
            return ;
        }
        for( int i=0; i< arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int newarr[] = new int[arr.length - 1];
        for( int i= 0; i< newarr.length; i++)
        {
            newarr[i] = arr[i] + arr[i+ 1];   
        }
         match(newarr);
    }
    public static void main(String args[])
    {
        int arr[]={ 1,2,3,4};
         match(arr);
    }
}