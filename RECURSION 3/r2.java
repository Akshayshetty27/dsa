 

 import java.util.Scanner;
 class r2{

    public static int fact(int num)
    {
        if(num==1 || num ==0)
        {
            return 1;
        }
        int fact1=fact(num-1);
        int factt=num *fact1;
        return factt;
    }
    public static int summ(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum=sum+n;
        return summ(n-1,sum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the number of elments");
        int num = sc. nextInt();
        System.out.println(" th sum of the number is :"+summ(num,0));
        System.out.println(" the factorial  of the number is :"+fact(num));
    }
 }