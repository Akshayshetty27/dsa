class floorceil
{
    public static void main(String args[])
    {
        int arr[]={1,3,4,5,9};
        int pos=-1;
        int value=7;
        if(arr[4] < value)
        {
             System.out.println("the floor value :"+4+ "there is no ceil value");
             System.exit(0);
        }

        for( int i=0; i< 4;i++)
        {
         if( arr[i] < value && arr[i+1] > value)
         {
             System.out.println(" "+arr[i]+ " "+arr[i+1]);
         }
        }
    }
}