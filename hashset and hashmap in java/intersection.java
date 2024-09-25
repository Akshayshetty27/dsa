import java.util.HashSet;
class  intersection
{

    public static void findIntersection(int arr[],int arr1[]){
    HashSet<Integer> set= new HashSet<>();

        for( int i : arr)
        {
            for (int j : arr1)
            {
                if(i == j)
                {
                    set.add(j);
                }
            }
        }


        for(int num : set)
        {
            System.out.print(" "+num);
        }
}
    public static void main(String[] args) {
          int arr[]= {3,5,6,7,};
        int arr2[]={ 1,2,3 ,5,5};
        findIntersection(arr, arr2);
    }
}