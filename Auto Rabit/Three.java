class Third{
    public static void main(String args[])
    {

        int arr[] = { 3,4,1,6,7,8,11};
         for( int i : arr)
         {
            System.out.print(" "+i);
         }
        int last = arr[ arr.length - 1];
        int n = arr.length; 
        for( int i = n - 1 ; i > 0 ; i-- )
        {

            arr[i] = arr[i - 1 ];
        }
        arr[0] =  last ; 
         
         System.out.println(" \nafter    rotation ");

         for( int i : arr)
         {
            System.out.print(" "+i);
         }
    }
}