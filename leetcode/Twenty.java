class Twenty{
    public static boolean isMonotonic(int[] nums) {
        if (nums.length < 2) {
            return true;
        }

        boolean isIncreasing = false;
        boolean isDecreasing = false;

        int i = 0;
        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            i++;
        }

        if (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                isIncreasing = true;
            } else {
                isDecreasing = true;
            }
        }

        for (int k = i; k < nums.length - 1; k++) {
            if (isIncreasing && nums[k] > nums[k + 1]) {
                return false;
            }
            if (isDecreasing && nums[k] < nums[k + 1]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Twenty obj = new Twenty();
        System.out.println("The given array is : ");
        int[] nums = {1, 2, 2, 3};
        for( int i : nums)
        {
            System.out.print( " "+ i);
        }
        System.out.println(" \n Is the array monotonic? " + obj.isMonotonic(nums));
    }

}