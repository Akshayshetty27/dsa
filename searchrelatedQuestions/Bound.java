class Bound 
{
    static int lower_bound(int arr[], int key )
    {
            for(int i=0; i< arr.length;i++)
            {
                if( arr[i]>= key )
                {
                    return i+1;
                }
            }
            return -1;
    }
      static int upper_bound(int arr[], int key )
    {
            for(int i=arr.length - 1; i>0;i--)
            {
                if( arr[i]<= key )
                {
                    return   arr.length -i +1;
                }
            }
            return -1;
    }
    public static void main(String args[])
    {
        int arr[]={3,5,8,15,17,19};
        int key=11;
        System.out.println(lower_bound(arr, key));
         System.out.println(upper_bound(arr, key));

    }
}