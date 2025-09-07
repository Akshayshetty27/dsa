class Tenth {
    static boolean canJump(int[] nums) {
        int farthest = 0; 
        for (int k = 0; k < nums.length; k++) {
            if (k > farthest)
                return false; 
            farthest = Math.max(farthest, k + nums[k]);
            if (farthest >= nums.length - 1)
                return true; 
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 1, 1, 4};
        System.out.println("the position " + canJump(arr));
    }
}
