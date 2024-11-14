class LowerBounf
{
   static public int lower(int arr[],int k)
    {
        for (int i=0; i<arr.length;i++)
        {
            if( arr[i]>=k )
            {
                return i+1;
            }
        }
        return -1;
    }
     static public int upper(int arr[],int k)
    {
        for (int i=0; i<arr.length;i++)
        {
            if( arr[i]>k )
            {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int sortedarr[]={3,4,7,8,11};
        int k=8;
        int sm= lower(sortedarr, k);
        if(sm == -1)
        {
            System.out.println(" not found any index with greater than k");
        }else
        {
              System.out.println("the lower bound index : "+sm);
        }

        int upp= upper(sortedarr,k);
        System.out.println(""+upp);
            }
}