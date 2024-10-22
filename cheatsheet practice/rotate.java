class rotate{
    public static void leftrotatebyone(int arr[])
    {
        int temp=arr[0];
        for(int i=0;i<arr.length - 1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length -1]=temp ;
    }

        public static void leftrotatebyk(int arr[],int  k)
        {
            int temp[]= new int [k];
            for( int i=0 ;i< k ;i++)
            {
                temp[i]=arr[i];
            }

            for(int i=0; i< arr.length - k; i++)
            {
                arr[i]= arr[i+ k];
            }
            int j=0;
            for( int i= arr.length - k ; i< arr.length && j< k;i++,j++)
            {
                arr[i]= temp[j];
            }

        }

    public static void movezerotoend(int arr[])
{
    int zerocount=0;
    int j=0;
    int b[]= new int[arr.length ];
    for( int i=0;i< arr.length;i++)
    {
        if( arr[i]== 0)
        {
            zerocount += 1;
        }else{
            b[j]=arr[i];
            j++;
        }
    }
    // System.out.println(" zerocount :"+zerocount);
   for(int i=0;i<arr.length- zerocount; i++)
    arr[i]=b[i];
  
   for( int i=arr.length- zerocount ;i<arr.length;i++)
    arr[i]=0;

      for( int i=arr.length- zerocount ;i<arr.length;i++)
      {
        b[i]=0;
      }
    
}

    public static void main(String args[])
    {
        // left rotate 
        int arr[]= { 3,4,5,6,7};
         for( int i=0;i<arr.length;i++)
         System.out.print(" "+ arr[i]);

             System.out.println("");
        leftrotatebyone(arr);
        for( int i=0;i<arr.length;i++)
         System.out.print(" "+ arr[i]);

        int k=2; // represent positon to be shifted 
       int  b[]= { 3,4,5,6,7};
        leftrotatebyk(b,k);
        System.out.println("");
        for( int i=0;i<b.length;i++)
         System.out.print(" "+b[i]);

        System.out.println("");

         int c[]={3,4,0,5,6,7,0,2,0 };
         movezerotoend(c);
         for(int i=0;i<c.length;i++)
          System.out.print(" "+c[i]);

    }
}