class consSum{
    public static void main(String args[])
    {
        int arr[]={1,43,0,6,5,23,4,7};
        int k=4;
        int max=0;
        int sum=0;
        for(int i=0; i<arr.length - k +1 ;i++)
        {
            
            for(int j=i;j<i+k;j++)
            {
                sum+=arr[j];
            }
            if(sum>max)
            {
                max=sum;
            }
            sum=0;
        }
        System.out.println("maximum sum : "+max);
    }
}