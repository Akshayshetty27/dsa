class FIbWithRec
{
     public static int fibanacci( int n)
    {
        if( n == 0 || n == 1)
        {
            return n;
        }

        return n * fibanacci( n - 1 );
    }
    public static void main(String args[])
    {
        int n; 

        System.out.println(" "+fibanacci(5));

    }
}