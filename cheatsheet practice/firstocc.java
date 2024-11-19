class firstocc
{
    public static void main(String args[])
    {
        int a[]= { 2,3,4,6,7,5,2,1,5};

        int first=-1;
        int val=3;
        for( int i=0; i<a.length;i++)
        {
            if(first <0 && a[i]== val)
            {
                System.out.println(""+a[i]);
                first=i+1;
                break;
            }
        }
        System.out.print("first occurance :"+first);
    }
}