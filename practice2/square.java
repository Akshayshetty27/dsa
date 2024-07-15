import java.util.Scanner;

class square{

 public static void main(String args[])
    {
Scanner sc= new Scanner(System.in);
System.out.println(" enter the number ");
int num=sc.nextInt();
int i;
for(i=1;i<=Math.sqrt(num);i++)
{
    if(i*i  == num)
    {
        System.out.println(" it is square number");
        break;
    }
}

    }

}