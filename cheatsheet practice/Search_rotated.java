class Search_rotated
{
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,7,8,9,11};
        int low=0;
        int high=arr.length-1;
        int target=8;
        int mid=0;
        while( low< high)
        {
             mid= ((low + high)/2);
               System.out.println(" mid :"+mid+" "+arr[mid]);

            if( arr[mid]== target)
            {
              System.out.println(" "+ (mid+ 1));
              System.exit(0);
            }
            else if( arr[mid] < target)
            {
                low= mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
       System.out.println(" not found "+mid);
    }
}