import  java.util.Scanner;
class repeat 
{
    static int  count=0;
    public static int  checkdigit(int i,int number){
    while( i > 0 )
    {
        if( i % 10  == number)
        {
           count++;
        }

        i=i/10;
    }
    return count;

    }
    public static void main (String args[])
{
int range,start;
Scanner sc= new Scanner(System.in);
System.out.println(" enter the start and range end");
start=sc.nextInt();
range= sc.nextInt();
System.out.println("enter the number you want to check");
int number=sc.nextInt();
int i;
int  count1;
for(i=start;i<=range;i++)
{
    
    count1 = checkdigit(i,number);
    System.out.println(""+count1);
}
System.out.println(" the digit "+number+ " occured "+ checkdigit(i, number)+" times");
}}