import  java.util.Scanner;
class gcd
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int min=Math.min(num1, num2);
        int max=(num1+num2)-min ;
        for(int i=min;i>0;i--)
        {
            if(min %i== 0 && max % i ==0 )
            {
                System.out.println("Greatest common devisor is "+i);
            return;
            }
        }

    }
}