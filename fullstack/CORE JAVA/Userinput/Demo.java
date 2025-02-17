import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Demo
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int a= System.in.read();
        System.out.println(" "+num + " ascii value of =  "+a);

        System.out.println(" enter the number ");
        InputStreamReader io= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(io);
        int nn= Integer.parseInt(in.readLine());
        System.out.println(" "+nn);

        in.close();

    }
}