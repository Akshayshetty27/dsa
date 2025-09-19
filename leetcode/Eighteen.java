import java.util.Scanner;
class Eighteen{
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int oneStepBefore = 2; 
        int twoStepsBefore = 1; 
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = result;
        }

        return result;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of stairs:");
       int n= sc.nextInt();

       System.out.println(" total nuber of ways "+climbStairs(n));
    }
}