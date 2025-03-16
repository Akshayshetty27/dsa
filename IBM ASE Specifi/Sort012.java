class Sort012
{
    public static void main(String args[])
    {
        int arr[]= { 0,1,0,2,2,1,0};

        int a[] = new int[arr.length];
        int first=0 ;
        int last=arr.length -1;
        int onecount=0;
        int i=0;

        while(i < arr.length)
        {
            if(arr[i] == 0)
            {
                a[first++]= 0;
            }else if(arr[i]== 2)
            {
                a[last--] = 2;
            }else if(arr[i] == 1)
            {
                onecount++;
            }

        i++;
        }

        for(int k=first ; k<=last ; k++)
        {
            a[k]= 1;
        }

        for( int j : a)
        System.out.println(j);
    }
}