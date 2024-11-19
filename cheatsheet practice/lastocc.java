class lastocc
{
    public static void main(String args[])
    {
        int a[]= { 2,3,4,6,7,5,2,1,5};

        int first=-1;
        int last=-1;
        int val=2;
        for( int i=0; i<a.length;i++)
        {
            if(first <0 && a[i]== val)
            {
                first=i+1;
                last=first;
            }
            if(a[i]== val)
            {
                last=i+1;
            }
        }
        System.out.print("first occurance :"+first+" last occurance :"+last);
    }
}