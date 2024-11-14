class first_last
{
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,8,8,11,13,11};
        int first=-1;
        int last=-1;
        int k=11;
        for(int i=0; i< arr.length ;i++)
        {
            if( arr[i]==k && first >-1)
            {
                last = i+1;
            }else if( arr[i]== k)
            {
                first=i+1;
                last=i+1;
            }
        }

        System.out.println(" first occurance :"+first+" Last occurance :"+last);
    }
}