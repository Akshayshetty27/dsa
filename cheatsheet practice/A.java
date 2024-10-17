import java.util.Scanner;
class A

{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number of elements ");
        int n=sc.nextInt();
                 System.out.println(" enter the elements ");
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i] < min)
            {
                min= arr[i];
            }
            else if(arr[i] > max)
            {
                max= arr[i];
            }


        }
         
         System.out.println(" "+min + "  "+max);

    }
}