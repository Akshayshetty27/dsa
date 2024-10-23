class stock 
{
    public static void main(String args[])
    {
       int  arr[]={ 7,1,5,3,6,4,};
       // program to predict best time to buy and sell stcks 

       int max= 0;
       int min=arr[0];
       for(int i=1;i<arr.length;i++)
       {
        int cost= arr[i]- min;
        max= Math.max(max , cost);
        min= Math.min(min , arr[i]);

       }
       System.out.println(" "+max);
    }
}