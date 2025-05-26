class Newstar
{
    public static void main(String args[])
    {
        int n=5;

        for( int k=0 ; k< n ; k++)
        {
            for( int i=0 ; i<  (2 * n) - k ; i++ )
            {
                System.out.print("  ");
            }
            for( int j=0 ; j< k + 1 ; j++)
            {
                System.out.print("  * ");
            }
            System.out.println();
        }
         for( int k=0 ; k< n ; k++)
        {
            for( int j=0 ; j < 2* (n -1)  + k ; j++)
            {
                System.out.print("  ");
            }
            for( int i=0 ; i<   n - k -1 ; i++ )
            {
                System.out.print("*   ");
            }

System.out.println();
        }
    }
}