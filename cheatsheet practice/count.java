import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
class count
{
    static int Max( int a , int b)
    {
        if( a> b)
         return a;
        else
         return b;
        
    }
    static void countof1(int arr[])
    {
          int maxcount=0;
        int cnt=0;
        int j=0;
          for( int i=0;i<arr.length;i++)
          {

           if(arr[i] !=1)
           {
            
            j=i +1;
            // System.out.println(arr[i]+"i"+i+" J"+j);
           }else 
           {
              maxcount=Max(maxcount , (i - j +1));
            // System.out.println(arr[i]+" "+(i - j +1)+" maax count"+maxcount);
          
           }
           
          }
           System.out.println(" "+maxcount);
    }



static void freqeqltoone(int arr[])
{
    int freq=0;
    HashSet<Integer> set= new HashSet<>();
    for( int i=0; i< arr.length;i++)
     set.add(arr[i]);
    HashMap<Integer,Integer> map = new HashMap<>();
    for( int i : set)
    {
        freq=0;
        for(int j=0; j< arr.length ;j++)
        {
            if( arr[j] == i)
             freq++;

        }
        map.put(i,freq);

    }
System.out.println(" array elements with frequencyy equal to  1 is");
    for( Map.Entry<Integer ,Integer> e : map.entrySet())
    {
        if( e.getValue() == 1)
        {
            System.out.println(" "+ e.getKey());
        }
    }
System.out.println(" array elements with frequencyy greater than 1 is");
    for( Map.Entry<Integer ,Integer> e : map.entrySet())
    {
        if( e.getValue() > 1)
        {
            System.out.println(" "+ e.getKey()+ " "+ e.getValue());
        }
    }
}
   
   static void longestwithsum(int arr[],int target)
   {

   int len=0;
   int maxlen=0;
int sum=arr[0];
int left=0,right=0;
while(right < arr.length)
{
    while(left <=right &&  sum > target)
    {
        sum-= arr[left];
        left++;
    }
    if( sum == target)
    maxlen= Max(maxlen , right - left + 1);
    right++;
    if( right < arr.length)
     sum+=arr[right];
}

System.out.println(" "+maxlen);
   

   }
    public static void main(String args[])
    {
        int arr[]={ 1,2,3,1,1,1,1,3,3};
      countof1(arr);
      freqeqltoone(arr);
      System.out.println(" ");
      longestwithsum(arr, 6);
    }
}