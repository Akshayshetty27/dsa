class  convert
{
    // public static void kshift(int arr[],int k)
    // {
    //     for(int i=0 ; i<arr.length /2; i++)
    //     {
    //         int temp1=arr[ (i + k) % arr.length];
    //         arr[ (i + k) % arr.length]=arr[i];
    //         arr[i]=temp1;
    //     }

    //     for(int j=0; j<arr.length;j++)
    //      System.out.print(" "+arr[j]);
    // }
    public static void main(String args [])
    {
        int arr[]={3,4,5,6,7,8};
        int k=2;
        int b[]=new int[arr.length];
         for(int i=0;i<arr.length;i++)
        {
         b[(i + k)% arr.length]= arr[i];
        }
        // kshift(arr, k);
       
        System.err.println("");
      for(int j=0; j<b.length;j++)
       System.out.print(" "+b[j]);

        }
    
}