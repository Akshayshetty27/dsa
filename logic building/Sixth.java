// pattern
//  n = 4
//  1
//  2 3
//  3 4 5
//  4 5 6 7

import java.util.Scanner;
class Sixth
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the numbeer ");
        int n = sc.nextInt();

        for( int i =1 ; i <= n ; i++)
        {
            for( int j = 0; j< i; j++)
            {
                System.out.print(" "+(i + j));
            }
            System.out.println();
        }
    }
}