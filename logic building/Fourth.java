import java.util.Scanner;
class Fourth
{
    public static int  Gcd_num(int num1 , int num2)
    {
        int k = minimum(num1, num2);
        

        for( int  i = k ; i > 1;  i-- )
        {
            if( num1 % i == 0  &&  num2% i ==0 )
            {
                return i;
            }
        }
        return 1;
    }

    public static int minimum(int num1 , int num2)
    {
        if( num1 > num2)
        {
            return num2;
        }
        return num1;
    }
    public static int Lcm_num(int num1 , int num2)
    {
        int k = minimum(num1 , num2);
        if((num2+ num1 - k)  % k ==0 )
        {
            return num2+ num1 - k ;
        }
        boolean isfound= true;
        int count = num2+ num1 - k  + 1 ;
        while(isfound)
        {
            if(count % num1 ==0 && count % num2 == 0 )
            {
                return count;
            }
            count++;
            
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter two numbers ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int gcd = Gcd_num(num1, num2);
        System.out.println( " greatest common devisior of "+num1+ " and  "+num2+" = "+gcd );

        int lcm = Lcm_num(num1 , num2) ;
        System.out.println(" least  common multipliication of  "+ num1 + " and  "+num2+ " = "+lcm);
    }
}