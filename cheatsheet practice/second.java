class second

{
  static  void secondlargest(int arr[],int max,int smax)
    {

for( int i=0; i< arr.length;i++)
    {
      if( arr[i] > max  )
      {
        smax=max;
        max=arr[i];
      }
      else if(arr[i] > smax && arr[i]!= max)
      {
        smax=arr[i];
      }
    }

       System.out.println(" "+smax);
    }

   static void secondsmallest(int arr[] , int min , int smin)
    {

    for( int i=1; i< arr.length;i++)
    {
      if( arr[i] < min  )
      {
        smin=min;
        min=arr[i];
      }
      else if(arr[i] < smin && arr[i]!= min)
      {
        smin=arr[i];
      }
    }
     System.out.println(" "+smin);
}

static void sortedornot(int arr[])
{
    for( int i=0; i< arr.length -1; i++)
    {
        
        if( arr[ i] > arr[i + 1])
        {
            System.out.println(" it is not sorted ");
            System.exit(0);
        }
    }
     if( arr[arr.length -2] < arr[arr.length -1])
        {
            System.out.println(" it is  sorted ");
        }
    
}

static void removeduplicate( int arr[])
{
    int i=0; 
    for( int j=0 ; j< arr.length ;j++)
    {
        if(arr[i]!= arr[j])
        {
            arr[i]=arr[j];
            i++;
        }

    }
    for( int k=0; k< i ;k++)
    {
        System.out.println(" "+arr[k]);
    }
}
     public static void main(String args[])


{

    int arr[]={4,5,6,6,7,8};
    int max=0;
    int smax=0;
 int min=4;
 int smin=5;

  
    secondsmallest(arr,min,smin);
    secondlargest(arr,max,smax);
  System.out.println(" arraay after removal of duplicate element in a sorted array ");
    removeduplicate(arr);  

    sortedornot(arr);
  
}
}