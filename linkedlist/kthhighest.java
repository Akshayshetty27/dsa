import java.util.Arrays;
import java.util.Scanner;

class kthhighest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 4, 1, 2, 6, 9, 3};  
        Arrays.sort(arr);

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. Please enter a number between 1 and " + arr.length);
        } else {
            System.out.println("Kth largest element: " + arr[arr.length - k]);
        }
    }
}
