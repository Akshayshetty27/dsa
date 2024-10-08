class pat1
{
    public static void printptn(int r, int c)
    {
        if( r== 0 )
         return;
    if(c < r)
           {
              printptn(r , c+1);
              System.out.print(" *");
           }
        if(r == c)
    {   
    printptn(r -1 , 0);
    System.out.println("");
         
    }
    }   
    public static void printptn2(int r, int c)
    {
        if( r== 0 )
         return;
    
        if(c < r)
           {
              System.out.print(" *");
              printptn2(r , c+1);
           }
        if(r == c)
    {   
         System.out.println("");
    printptn2(r -1 , 0);
   
         
    }
    }   

    public static void  bubblesort( int arr[],int c,int r)
    {
        if( r== 0 )
         return ;
        if( c < r)
    {
          if( arr[c] >arr[c+1])
          {
            int temp= arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
          }

          bubblesort(arr,c+1,r);    
    }else{
        bubblesort(arr,0,r -1);
    }

    }
    
    public static void selectionsort(int arr[],int r , int c,int max)
    {
        if( r== c)
         return;
        
        if( c< r)
        {
            if( arr[c]>arr[max])
           { 
            selectionsort(arr,r,c+1,c);
            }
         else{
            selectionsort(arr,r,c+1,max);
         }

        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsort(arr,r-1,0,0);
        }

    
    }
     public static void main(String args[])
    {
        
      int arr[]={5,2,3,4,7,1};
       printptn(4,0 );
System.out.println("");
         printptn2(4,0 );

         bubblesort(arr,0,5);

         for( int i : arr)
          System.out.print(" "+i);
 int brr[]={5,2,3,4,7,1};
selectionsort(brr,0 ,5,0);

System.out.println("");
System.out.println("");
  for( int i : brr)
          System.out.print(" "+i);
    }
}