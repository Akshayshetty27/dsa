import java.util.ArrayList;
class Problem1
{
    public static boolean chcksorted( int arr[],int i)
    {
       if( i == arr.length -1)
        return true;
       else 
      
       return arr[i]<arr[i+1] &&  chcksorted(arr , i+1);
    }
    public static boolean linearsearch(int arr[] , int i,int ele  )
    {
    if( i == arr.length -1 && arr[i]!= ele)
        return false;
    else if(arr[i]== ele)
      return true;
     return arr[i]== ele ||  linearsearch(arr , i+1,ele);
     }

static ArrayList<Integer> lst= new ArrayList<Integer>();
     public static ArrayList<Integer> findallindex(int arr[], int i ,int ele)
     {
        if( i == arr.length -1 && arr[i]== ele)
        { 
             lst.add( i);
             return lst;
        }
    else if(arr[i]== ele)
     {
        lst.add(i);
     } 
     return  findallindex(arr , i+1,ele);
     }
     
    public static void main(String args [])
    {
        int arr[]= { 2,4,6,7,5,3,4};
        System.out.print("finding whether the given array is sorted or not :"+chcksorted(arr, 0));
        System.out.println("\n finding presence of element using recursion "+linearsearch(arr,0,4));
        System.out.println(" "+findallindex(arr,0,4));
    }
}