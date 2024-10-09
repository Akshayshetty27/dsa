class missing
{
    public static void main(String args[])
    {
        int n=5;
        int arr[]={1,2,3,5};
        int missing=-1;
        int i=0;
        // expected output is 4
        while(i < arr.length)
        {
            if(i+ 1 != arr[i])
             {
                missing= i + 1;
                break;
                }
            i++;
        }
            System.out.println(" "+missing);
    }
}