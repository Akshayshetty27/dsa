// //  let there is  n * m   Matrix 
// import  java.util.Scanner;

// class total
// {

//     public static int countPaths(int i , int j,int n, int m)
//     {
//         if(i==n || j==n)
//         {
//             return 0;
//         }
//         if(i==n-1 || j==m-1)
//         {
//             return 1;
//         }
//         int downpaths= countPaths(i+1,j,n,m);
//         int rightpaths= countPaths(i,j+1,n,m);
//         return downpaths+rightpaths;
//     }
//     public static void main(String args[])
//     {
//         int m,n;
//         Scanner sc= new Scanner(System.in);
//         System .out.println(" enter the number of rows and column");
//         m=sc.nextInt();
//         n=sc.nextInt();
//       int totalpaths= countPaths(0,0,n,m);
//  System .out.println("  total paths :"+totalpaths);
//     }
// }
import java.util.Scanner;

public class total {

    public static int countPaths(int i, int j, int n, int m) {
        // Check if out of bounds
        if (i >= n || j >= m) {
            return 0;
        }
        // Check if reached bottom-right corner
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // Move right and down
        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        n = sc.nextInt();
        m = sc.nextInt();

        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Total paths: " + totalPaths);
    }
}
