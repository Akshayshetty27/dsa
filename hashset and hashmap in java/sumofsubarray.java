class sumofsubarray
{
    public static void main(String[] args) {
        int arr[]= { 1,2,3};
        int prefix[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum +=arr[i];
                prefix[i]=sum;
        }

         for(int i=0;i<arr.length;i++)
           System.out.print(" "+prefix[i]);

           
    }
}