import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Missing
{
 public static void main(String args[])
 {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();

    HashMap<Integer, Integer> map = new HashMap<>();

    
    int arr[] = new int[n];

    for( int i=0 ; i< n ; i++)
     arr[i] = sc.nextInt();

    int actsum = ( n * ( n+1)) / 2 ;

    int sum=0;
    for( int i : arr)
    { 
     sum+=i;
     map.put(i , map.getOrDefault( i, 0) + 1);
    }
    int repeat=0;
    for( Map.Entry<Integer , Integer >  e : map.entrySet() )
    {
        if( e.getValue() > 1)
         repeat = e.getKey();
    }
           int miss= Math.abs(sum - actsum) + repeat ;
if( repeat >  n/ 2)
{
    miss= Math.abs(sum - actsum)  ;
}
  

    System.out.println(" "+miss + " "+repeat);

 }
}