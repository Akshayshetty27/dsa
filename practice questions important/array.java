class array
{
    public static void main(String[] args) {
        int arr[]={3,5,2,4,1};
        int k=5,i;
         int b[]=new int[arr.length];

        for(i=0;i<arr.length;i++)
        {
         b[i]= arr[( i + k) % arr.length];
        }
        for( i=0;i<arr.length;i++)
         System.out.print(" "+b[i]);

    }
}