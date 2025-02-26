class zeroatlast{

    
      public static void main(String args[])
    {
        int arr[]={4,5,0,1,0,2,0,9};
        int newarr[]= new int[arr.length];
        int k=0;
        for( int i=0 ;i< arr.length ;i++)
        {
            if( arr[i] != 0 )
              newarr[k++]=arr[i];
        
        }

        for( int j=k ; j< arr.length ;j++)
        {
            newarr[j]= 0;
        }

        for( int i=0 ; i< arr.length ;i++)
        {
            System.out.println(" "+arr[i]+" "+newarr[i]);
        }





    }
}