class Longest_Increasing_Subsequence {
    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 8, 2, 3, 4, 5,3, 6, 7, 8, 9};

        int max = 1;  
        int counter = 1;  

        for (int i = 0; i < arr.length - 1; i++) { 
            if (arr[i] < arr[i + 1]) {
                counter++; 
            } else {
                max = Math.max(max, counter); 
                counter = 1; 
            }
        }

        max = Math.max(max, counter);

        System.out.println("Longest Increasing Subsequence Length: " + max);
    }
}
