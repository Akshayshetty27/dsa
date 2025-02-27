class largestnum{
    public static void main(String args[])
    {
        int arr[]= { 3, 4, 5, 1, 2, 3, 9, 7 };
        int l=0;
        int r=arr.length -1 ;
        int max=0 ;
        while ( l < r)
        {
            System.out.println(" "+ max + " "+ arr[l] +" "+arr[r]);
            if( max > arr[l] &&  max > arr[r])
            {
                l++ ;
            r--;
                continue;
            }
            if( arr[l] > max)
            {
                max =arr[l];
            }
            if( arr[r] > max )
            {
                max = arr[r];
            }

            l++ ;
            r--;

        }

        System.out.println(" "+ max);
    }
}