
import java.util.Arrays;
import java.util.Scanner;
class returnarr{

    public static int[] sort(int arr[])
    {
     Arrays.sort(arr); 
     return arr;
       
    }
    public static void main(String args[])
    {
        int arr[]= {3,4,5,6,1,9,3,};
        int newarr[]= new int[arr.length];
        newarr=sort(arr);
        for( int i : newarr)
        {
            System.out.println(" "+i);
        }
Scanner sc = new Scanner(System.in);
System.out.println(" enter the string of array ");
String str = sc.nextLine();

String strarr[]= str.split(" ");

int con[]= new int[strarr.length];

for( String i : strarr)
{
    System.out.println(" "+i);
}

for( int i =0 ; i<con.length; i++)
{

    
        con[i] = Integer.parseInt(strarr[i]);

}

System.out.println(" enter the string  ");


       for( int  i : con)
{
    System.out.println(" "+i);
}
    }
}