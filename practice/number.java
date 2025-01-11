import java.util.Scanner;

class number{

 static boolean isPrime(int n)
 {
    if(n == 1 || n== 2)
    {
        return true;
    }
    for(int i=3 ;i<n;i++)
    {
        if(n % i == 0)
        {
            return false;
        }
    }
    return true;

 }
    static boolean isPalindrome(int n)
    {
        int temp=n;
        int m=0,r=0;

        while(n > 0)
        {
            r= n%10;
            m= m*10+ r;
            n=n/10;
        }

        if(m == temp)
        {
            return true;
        }
return false;


    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number \n");
        int n=sc.nextInt();
if(isPalindrome(n))
{
    System.out.println(" the number is palindrome ");
}else
{
        System.out.println(" the number is not a palindrome ");

}


if(isPrime(n))
{
    System.out.println(" the number is prime ");
}else
{
        System.out.println(" the number is not a prime ");

}
    }
}