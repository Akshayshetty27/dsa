class rotate
{
    public static void main(String args[])
    {
        int arr[]= { 3,5,4,2,};
       int  k=2;
     int b[]= new int[arr.length];

     for( int i=0;i< arr.length;i++)
        b[i]= arr[(i+k) % arr.length];
        
     for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]+" "+b[i]);
}
}