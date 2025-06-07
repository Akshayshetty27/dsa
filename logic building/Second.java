//  Rotate Matrix in Spiral Order
// Problem:
// Rotate a matrix in spiral order without using built-in rotation methods.

// Input:           // Output:

// Copy            // Copy
// Edit            // Edit
// 1  2  3         // 7  4  1
// 4  5  6         // 8  5  2
// 7  8  9         // 9  6  3
import java.util.Scanner;
class Second{
    public static void main(String args[])
    {
        int arr[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        // {{1 , 2 , 3 } , { 4, 5, 6} , { 7, 8 ,9 }};

        System.out.println(" enter the matric ");
        for( int i=0 ;i< 3 ; i++)
        {
            for( int j=0 ; j< 3 ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int newarr[][] = new int[3][3];

        for( int i = 0 ; i< 3 ; i++ )
        {
            for( int j= 2; j>=0  ;j-- )
            {
                newarr[i][2 - j] =  arr[j][i];
            }
        }
System.out.println(" spiral version --> ");

        for( int i=0 ;i< 3 ; i++)
        {
            for( int j=0 ; j< 3 ; j++)
            {
                System.out.print(" "+newarr[i][j]);
            }
            System.out.println();
        }
    }
}