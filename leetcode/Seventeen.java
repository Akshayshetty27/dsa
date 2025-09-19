import java.util.Scanner;

class Seventeen {
    public static void rotate(int[] nums, int k) {
        int n = nums.length; 
        k = k % n;  
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations:");
        int arr[] = {1,2,3,4,5,6,7};
        int k = sc.nextInt();
        System.out.print("Original array: ");
         for (int num : arr) {
            System.out.print(num + " ");
        }
        rotate(arr, k);  

    System.out.println();
        
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
