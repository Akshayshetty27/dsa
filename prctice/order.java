import java.util.*;
class java
{
    public static void main (String args[])
{
    int n;
    Scanner sc= new Scanner(system.in);
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
            System.out.println(" the number is prime"+arr)
        }
    }
}}