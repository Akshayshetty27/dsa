class C{
    public static void main(String args[])
    {
        int arr[]= { 5,6,7,4,3};
        int sum=0,k=0,s=0;
        for(int i=0;i<arr.length -1;i++){
                if( arr [i]+ arr[i+1] > sum)
                {
                    sum=arr[i]+arr[i+1];
                    k=arr[i];
                    s=arr[i+1];
                }
                    }

                    System.out.println(" largest continuos two sum is "+sum +" elements are "+k+ " "+s);
    }
}