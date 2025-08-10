import java.util.Scanner;

class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int t = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    System.out.print("1 ");
                } else if (i > j && i % 2 == 0 && j % 2 == 0) {
                    System.out.print((i + j) + " ");
                    t = i + j;
                } else if (i > j && i % 2 != 0 && j % 2 == 0) {
                    System.out.print((i + t - 1) + " ");
                } else if (i > j) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
