import java.util.Scanner;
class Swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter value for a and b ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping element a="+a+" b= "+b);

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swapping element a="+a+" b= "+b);
    }
}