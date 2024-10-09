class triplet
{
    public static void main(String args[])
    {
        int arr[]={1,-1,0,1,2,1};
        int count=0;

        for(int i=0 ; i< arr.length -2 ;i++)
        {
            for( int j=i+1 ; j<arr.length -1;j++)
            {
                 if( arr[i]+ arr[j]+ arr[j+1] == 0 )
                 {
                    count++;
                 }
            }
        }

        System.out.println(" "+count);

    }
}