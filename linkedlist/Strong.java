// Check if a Number is a Strong Number (sum of factorial of digits = number)
import java.util.Scanner;
 class Strong{

    public static int facto( int num )
    {
        if( num == 0  || num == 1)
        {
            return 1;
        }
        int sum =1;
        for( int i = num ; i > 1 ; i--)
        {
         sum = sum * i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" entere the number \n");
        int n= sc.nextInt();
        int factsum=0;
        int s= n;
        while( n > 0)
        {
            int r= n % 10 ;
            factsum = factsum + facto(r);
            n = n /10;
        }

if( s== factsum)
{
System.out.println(" the  "+factsum+ " is a Strong number ");
}else
{
    System.out.println(" the  "+factsum+ " is not a  Strong number ");

}
        
    }
 }