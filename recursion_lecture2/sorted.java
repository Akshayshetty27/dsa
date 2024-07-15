import java.util.Scanner;
//  time is 48.51

class sorted{
    public static int diff;
public static boolean sortedornot(int arr[],int index)
{
    if(index == arr.length-1)
    {
     return true;
    }
    if(arr[index]<arr[index+1])
    {
       return sortedornot(arr,index+1);
       
    }
    else{
         return false;
    }
}



public static  void main(String args[])
{
Scanner sc= new Scanner(System.in);
int arr[]= new int[5];
int i;
System.out.println(" enter  array elements ");
for(i=0;i<5;i++)
{
    arr[i]=sc.nextInt();
}
if(sortedornot(arr,0))
{
    System.out.println(" array is in sorted method ");
}
else{
    System.out.println(" array is not sorted");
}

}
}