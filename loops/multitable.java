import java.util.Scanner;
class multitable{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the number \n");
        int n= sc.nextInt();
        int i;

        for(i=1;i<11;i++)
        {
            System.out.println(" "+n+" X "+i+" = "+(n*i));
        }

    }
}