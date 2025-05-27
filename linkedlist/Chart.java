// 2 -> 3 ->5
// ->7 ->11 ->
// 13 ->17 ->19

class Chart {
    static int k = 1;

    public static int nextprime() {
        while (true) {
            if (isPrime(k)) {
                return k++;
            } else {
                k++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int n = 3;
        for (int i = 0; i < 2 * (n * n) - 3; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            if (i % 2 == 0) {
                int temp = nextprime();
                System.out.print(temp + " ");
            } else {
                System.out.print("->");
            }
        }
    }
}
