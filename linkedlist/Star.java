class Star
{
    public static void main(String args[])
    {
        int n=5;
        for( int k=0; k<n ; k++)
        {
        for(int i=1 ; i< n - k ; i++)
        {
            System.out.print(" ");
        }
        for( int j=0; j < k+1  ; j++)
        {
                System.out.print(" *");
        }
            System.out.println();
        }

         for( int k=0; k<n ; k++)
        {
            for( int j=0; j < k + 1  ; j++)
        {
                System.out.print(" ");
        }

        for(int i=1 ; i< n - k ; i++)
        {
            System.out.print(" *");
        }
        System.out.println();
        }
        
    }
}