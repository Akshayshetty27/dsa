class demo{

    public static  void linear_search(int arr[],int ele)
    {
        for( int i=0; i< arr.length; i++)
         { 
            if( arr[i]== ele )
            {
                
        System.out.println("the element found at "+(i+1));
        return;
            }
         }

         
        System.out.println("the element not found ");
    }


    public static void sort(int arr[])
    {

          System.out.println(" before sorting ");

        for( int i : arr)
         System.out.print(" "+ i);

        for( int i=0 ; i< arr.length; i++)
        {
            for( int j= i ; j< arr.length - 1 - i ; j++)
            {
                if( arr[j] > arr[ j+ 1])
                {
                     int temp= arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }

        }


        System.out.println(" \nafter sorting ");

        for( int i : arr)
         System.out.print(" "+ i);
    }
    public static void selectionsort(int arr[])
    {
     int min;
     int temp;
     int index;
     boolean swap= false;
     System.out.println(" before sorting ");

        for( int i : arr)
         System.out.print(" "+ i);

        for( int i=0;i< arr.length; i++)
        {
         min= arr[i];
         index=  i;
            for( int j= i + 1; j < arr.length ; j++)
            {
                if( arr[j] < min)
                {

                    min= arr[j];
                    index = j;
                    swap= true;

                }
            }
            if( swap )
            {
                arr[index]= arr[i];
                arr[i] = min ;
                swap = false;
               
            }
System.out.println(" ");
               for( int k: arr)
         System.out.print(" "+ k);
        }
                System.out.println(" \nafter sorting ");


        for( int i : arr)
         System.out.print(" "+ i);
    }
    public static void binarysearch(int arr[],int ele,int left , int high )
    {
         while( left < high )
         {
            int mid= (left + high)/ 2 ;

            if( arr[mid] == ele )
            {
                System.out.println(" array element found at "+ (mid + 1));
                return;
            }else if( arr[mid] < ele )
            {
                left = mid + 1 ;
            }else{
                high = mid  ;
            }

         }
System.out.println("the element not found ");
    }


    public static void insertionsort(int arr[])
    {
        for( int i=1; i< arr.length; i++)
        {
            int key = arr[i];
            int j= i -1;
             while ( j >= 0 && arr[ j ]> key )
             {
                arr[j+1]= arr[j];
                j--;

             }
             arr[j+ 1] = key ;
System.out.println(' ');
             for( int k : arr)
         System.out.print( " "+ k);
        }

System.out.println(" \n after-sorting");

        for( int i : arr)
         System.out.print( " "+ i );
    }
    public static void main(String args[])
    {
        int arr[]= { 3,1,2,6,65,8,9};
        int ele=10;
        linear_search(arr , ele );
        int arr1[] = { 2,5,6,7,10,15};
        binarysearch(arr1,15, 0 , arr.length);
        // sort(arr);

        // selectionsort(arr);
        insertionsort(arr);

    }
}