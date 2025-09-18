
import java.util.Scanner;
class Fifteen
{
    public static int mySqrt(int x) {
    int i=1 ; 
  
        while (i * i <= x) {
            i++;
        }  
        return i - 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the square root :");
        int x = sc.nextInt();
        System.out.println("The square root of " + x + " is: " + mySqrt(x));

    }
}