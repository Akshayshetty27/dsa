// Problem:
// Given an integer n, generate the following pattern:

// makefile
// Copy
// Edit
// Input: 4
// Output:
// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.Scanner;
class Third 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter the number : ");
        int n = sc.nextInt();
        int c=1;
        for( int i =0 ; i< n; i++)
        {
            for( int j=0 ; j<= i ; j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}