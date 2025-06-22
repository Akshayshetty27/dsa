//  pattern 
// n = 5
// 2
// 4 3
// 6 5 4
// 8 7 6 5

import java.util.Scanner;
class Seventh
{
    public static void main(String args[])
    {
        Scanner sc =  new  Scanner(System.in);
        System.out.println(" enter the number ");
        int  n = sc.nextInt();
        for( int i=1 ; i< n ; i++)
        {
            for( int j=i ; j>0 ; j--)
            {
                System.out.print(  ( i + j)+ " ");

            }
            System.out.println();
        }


    }
}