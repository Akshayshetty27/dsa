class Lonegstincreasepossible
{ 

    
    public static void main( String args[])
    {
       int  arr[] = {33, 22, 9, 33, 21,41,  60,};
        int max=0;
       for( int i=0 ; i< arr.length;i++)
       {
        int count=0;
        int temp = arr[i];
        for( int j= i+1 ; j< arr.length ; j++)
        {
            if( temp < arr[j])
            {
                count++;
                temp=arr[j];
            }
        }
        max= Math.max(max, count);
       }
System.out.println(" "+(max+1));
    }
}