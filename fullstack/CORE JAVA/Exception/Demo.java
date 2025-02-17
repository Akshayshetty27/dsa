import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        System.out.println("java "+(2 + 2));
    int n=0;

    // ArithmeticException divid eby zero error 
    try{
    int result = 10/n;
    System.out.println(" "+result);
    }catch(Exception e)
    {
        System.out.println(" "+e);
    }finally
    {
System.out.println( "Exception is handled Successfully ");
    }


// InputMismatchException
    Scanner sc= new Scanner(System.in);
    try{
        System.out.println("integer value ");
    int a= sc.nextInt();
     System.out.println("entered integer value "+a);
    }catch(Exception s)
    {
        System.out.println(" "+s+" enter the integer value ");
    }

//  ArrayIndexOutOfBoundsException:
try {
int arr[]= new int[4];
arr[4]=9;
}catch(ArrayIndexOutOfBoundsException w)
{
    System.out.println("  "+ w);
}





System.out.println("  hello");




    }
}