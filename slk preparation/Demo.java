import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
class Demo
{
    static int missing(int arr[])
    {
int n= arr[arr.length -1];
int sum= (n* (n +1)  )/2;
int arrsum= 0;
for(int i : arr)
 arrsum+= i;

arrsum= sum -arrsum;
return arrsum;
    } 

   public  static void  norepet(String str)
   {
HashSet<Character> set= new HashSet<>();
HashMap< Character ,Integer> map = new HashMap<>();

for(  int i=0; i< str.length();i++  )
{
set.add(str.charAt(i));
}


for ( char ch : set )
{
int count =0; 
for( int i=0; i< str.length(); i++)
{
    if( ch == str.charAt(i))
    {
        count++;
    }
}
map.put( ch , count);

}

for( Map.Entry<Character ,Integer> e : map.entrySet())
{
    if(e.getValue() == 1)
    {
        System.out.println(" "+e.getKey()+" "+e.getValue());
    }
}

   }
    public static void main(String args[])
    {
        int arr[]= { 1,2,3,4,5,6,7,9};


    System.out.println(" the missing number is :"+missing(arr));
    String str="abaccd";

    norepet(str);

    }
}