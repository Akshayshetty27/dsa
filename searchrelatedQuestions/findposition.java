class findposition
{
    static int find(int arr[], int key)
    {
        for( int i=0;i<arr.length;i++)
        {
            if( arr[i] == key )
            {
             return i+1;
            }
        }
        return -1;
    }
    public static void main(String  args[])
    {
        int arr[]={ 4,5,8,9,11,};
        int key=8;
       System.out.println( find(arr, key));

    }
}