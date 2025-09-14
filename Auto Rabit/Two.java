class Two 
{
    static int findlarge(int arr[])
    {
        int lowest = arr[0];
        for( int i : arr)
        {
            if( lowest < i )
            {
                lowest = i;
            }
        }

        return lowest;
    }
    static int findsmall(int arr[])
    {
         int highest = arr[0];
        for( int i : arr)
        {
            if( highest > i )
            {
                highest = i;
            }
        }

        return highest;

    }
    public static void main(String args[])
    {
        int arr[] = { 3,4,1,6,7,8,11};
        System.out.println("the largest item :"+findlarge(arr));
        System.out.println("the  smallest item : "+findsmall(arr));

    }
}