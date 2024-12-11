import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashSet;

class Program3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        LinkedList<Integer> list= new LinkedList<>();
        HashSet <Integer> set= new HashSet<>();

        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
            list.add(arr[i]);
        }

list.sort(null);
for(int i=0; i<n;i++)
{
    for( int j=i+1; j< n;j++)
    {
        if( list.get(i) == list.get(j))
        {
            list.remove(i);
        }
    }
}
        
System.out.print(" "+list);
    }
}