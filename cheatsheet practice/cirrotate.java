// progrsm t perform n  circular rotations 
class cirrotate {
    public static void main( String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=3;
        int ans[]=new int[arr.length];
        for(int k=0; k< n; k++ )
           ans[k]= arr[ k + n % arr.length -1];
        for(int i=0; i !=(arr.length - 1 + n) % arr.length  ; i++)
        {
            arr[i]= arr[i + n % arr.length ];
        }
        int m=0;
        for(int j=ans.length; j< arr.length ; j++)
        {
            arr[j]= ans[m];
            m++;
        }

        
        for( int j : arr)
        {
            System.out.print(" "+j);
        }
    }
} 