class len{
    public static void main (String args[])
    {
        // sub array -> contigius part of an array 
        int arr[]= { 4,5,3,1,1,2,6,7,2};
        int target=20;
        int len=1,temp=0,size=0;
        for( int i=0;i<arr.length;i++)
        {
            temp=arr[i];
          
            len=1;
            for( int j=i+1 ;j<arr.length;j++)
            {
             temp+= arr[j];
              len++;
              
             if(temp < target )
             {
                // System.out.println(arr[j]+" "+temp+" "+size);
                continue;
             }else if( temp == target)
             {
                 size=Math.max(size,len);
                // System.out.println("sum=10 "+arr[j]+" "+temp+" "+size);
                        // int arr[]= { 4,5,1,1,2,2,6,7,2};

                 break;
             }

            }
        }

        System.out.println(" "+size);
    }
}