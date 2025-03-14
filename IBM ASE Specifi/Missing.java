class Missing
{
    public static void main(String args[])
    {
        int arr[]={1,2,0,4 ,3};
        int n= arr.length;
        int sum=0;
        for(int i : arr)
        {
            sum+= i;
        }
        int miss =( ( n* (n+1)) /2 ) - sum;
        if( miss >=0 )
         System.out.println("Misiing number is "+miss);
    }
}