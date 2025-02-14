class Binary
{
    public static void binary_search(int arr[],int ele)
    {
         int low=0;
        int high= arr.length -1;
        int mid= (low+ high)  / 2;
    
        while( low < high )
        {
            if( arr [mid] == ele )
            {
                System.out.println(" "+(mid + 1));
                return;
            }else if( arr[mid] < ele)
            {
                 System.out.println(" // ");
                low= mid;
                mid= (low+ high)/ 2;
                
            }else if( arr[mid] > ele){
                System.out.println(" *");
                high= mid;
                mid=(low + high)/2;
            }
        }
        
    }


static public void selection_sort(int arr[])
{
    int mini;
    int temp=0;
    boolean less= false;
    int len= arr.length;
    for(int i=0; i< len  - 1;i++)
    {
        mini=i;

        for(int j= i + 1 ; j< len  ;j++)
        {
            if( arr[j] < arr[mini])
            {
                mini= j ;
                temp= arr[mini];
                less= true;
          }
        }
       if(less){

      arr[mini]= arr[i];
        arr[i]= temp;
        less = false;
 }
    }




    for( int k : arr){
        System.out.println(" "+k);
    }
}


public static  void   pattern1(int num)
{
    //   *
    //  * *
    //*  *  * 

    for( int i=1; i< num ; i++)
    {
        for( int j= 0 ; j< num -i ; j++)
        {
            System.out.print(" ");
        }

        for( int j=0 ; j < i ; j++)
        {
                System.out.print("* ");
        }

        System.out.println("");
    }
}

public static  void   pattern2(int num)
{
    //   1
    //  2 3
    //4  5  6 

int count=1;
    for( int i=1; i< num ; i++)
    {
        for( int j= 0 ; j< num -i ; j++)
        {
            System.out.print(" ");
        }

        for( int j=0 ; j < i ; j++)
        {
                System.out.print(" "+count);
                count++;
        }

        System.out.println("");
    }
}


public static  void   pattern3(int num)
{
    //   *
    //  ***
    // ***** 

    for( int i=1; i< num ; i++)
    {
        for( int j= 0 ; j< num -i ; j++)
        {
            System.out.print(" ");
        }

        for( int j=0 ; j < 2* i - 1 ; j++)
        {
                System.out.print("*");
        }

        System.out.println("");
    }
}


public static  void   pattern4(int num)
{
    //   1
    //  3 6
    //10 15 21 
    int sum=1;
    int count=1;

    for( int i=1; i< num ; i++)
    {
        for( int j= 0 ; j< num -i ; j++)
        {
            System.out.print(" ");
        }

        for( int j=0 ; j < i ; j++)
        {
                System.out.print(" "+(sum));
                count++;
                sum= sum + count ;
        }

        System.out.println("");
    }
}
    public static void main(String args[])
    {
        int arr[]={ 3,4,5,6,7,8};
        int arr1[]={ 10,9,4,5,3,7,8};

        int ele= 6;
        binary_search(arr , ele );
System.out.println(" selection sort ");
        selection_sort(arr1);

        // pattern 1
         pattern1(4);
         pattern2(4);
         pattern3(4);
         pattern4(4);

}
}