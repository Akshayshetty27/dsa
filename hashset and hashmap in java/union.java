
// import java.util.HashMap;
import java.util.HashSet;

class union{
    
    
    public static void findunion(int arr[],int arr1[])
    {
        HashSet<Integer> set= new HashSet<>();

  for( int i : arr)
   set.add(i);
  for(int j : arr1)
   set.add(j);



     


        for(int num : set)
        {
            System.out.print(" "+num);
        }

    }
    
    public static void main(String[] args) {
        int arr[]= {3,5,6,7,};
        int arr2[]={ 1,2,3 ,5};
        findunion(arr,arr2);

           }
}