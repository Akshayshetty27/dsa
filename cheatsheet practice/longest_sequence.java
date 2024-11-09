class longest_sequence
{
    public static void main(String args[])
    {
        int arr[]={ 3,1,2,4,5,6,9,10,11,12,13};
      
        // better approach 
        // 1.sorting 

        for( int i=0; i< arr.length; i++)
        {
            for( int j=i; j< arr.length -1 ;j++)
            {
              if( arr[j] > arr[j+1])
              {
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j + 1]= temp;
              }
            }
        }

System.out.println("array after sorting");
        for( int i : arr)
        {
            System.out.println( i);
        }
  int len=1;
  int maxlen=0;

         for( int i=0; i< arr.length-1 ;i++)
        {
            if( arr[i+1]== (arr[i]+1))
            {
                len++;
                continue;
            }
        else
        {
            if(len > maxlen)
            {
                maxlen= len;
                len=1;
            }
        }

        }
        System.out.println("  "+maxlen);

        

    }
}