import java.util.Scanner;
class Alex
{
    public static int fibanacci(int n)
    {
        if(n==0)
         return 0;
        else if(n==1)
         return 1;
        else 
         return fibanacci(n-1)+fibanacci(n-2);
     
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number ");
        int n= sc.nextInt();
        System.out.println(" "+fibanacci(n+1));



    }
}