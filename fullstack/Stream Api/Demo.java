import java.util.List;
// import java.util.Stream;
import java.util.stream.Stream;
import java.util.Arrays;
class Demo
{
    public static void main(String args [])
    {
    int arr[]= { 3, 4, 2,1 ,8};
    List<Integer> nums= Arrays.asList(3, 4 ,2 ,1 ,7 ,8);
    int sum =0;
    for(int i : nums)
    {
        if( i % 2 ==0 )
        {
            sum = sum + (i *2);
        }
    }

nums.forEach( i  ->  
System.out.println(" "+ i));

    System.out.println("Sum of double the even number  :"+ sum);

Stream<Integer>  s= nums.stream();
s.forEach( (n) -> {
    if( n % 2 == 0) 
     System.out.println("    double :  "+ (n*2));
    else
           System.out.println(" "+ (n));

});
   


   int res= nums.stream()
                .filter( n  ->  n % 2 == 0)
                .map(n ->  n * 2) 
                .reduce( 0,(c, e) -> c + e);
   System.out.println(" "+res);
}
}