import java.util.Scanner;

class r1
{
    //  method to return the number  in the decreasing order 
    public static void printt(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        printt(num-1);
    }
     //  method to return the number  in the increasing order 
    public static void printt(int i,int  num)
    {
        if(i==num)
        {
            return;
        }
        System.out.println(i);
        printt(i+1,num);
    }
    public static void main (String args [])
    {
Scanner sc = new Scanner (System.in);
System.out.println(" enter the starting of elemets ");
int i=sc.nextInt();
System.out.println(" enter the number of elments");
int num = sc. nextInt();

printt(i,num);
    }
}