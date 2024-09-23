import java.util.*;
class order
{
    public static boolean isPrime(int num)
    {
        if(num== 1 || num== 2)
         return true;
        else
        for(int i=3;i<num;i++)
         {
            if(num % i == 0)
             return true;
         }

         return false;
    }
    public static void main (String args[])
{
    int i,n;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }

    for(i=0;i<n;i++)
    {
        if(isPrime(arr[i]))
        {
            System.out.println(" the number is prime"+arr[i]);
        }
    }
}}