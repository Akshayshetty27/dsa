class Ninteen{

    public static int findMaxLength(int[] nums) {
        int zerocount=0;
        int onecount=0; 
        int n = nums.length;
        int k =0 ;
        
     while (k < n) {
    if (nums[k] == 0) {
        int count = 0;
        while (k < n && nums[k] == 0) {   
            count++;
            k++;
        }
        zerocount = Math.max(count, zerocount);
    } else if (nums[k] == 1) {
        int count2 = 0;
        while (k < n && nums[k] == 1) {  
            count2++;
            k++;
        }
        onecount = Math.max(count2, onecount);
    }
}

        int maxcount=  2 * (Math.min(zerocount , onecount));

        return  maxcount;
    }
public static void main(String[] args) {
    int[] nums = {0,1,0,1,0,1,1};
    System.out.println("The given array is : ");
    for( int i : nums){
        System.out.print(i+" ");
    }
    System.out.println("\n"+findMaxLength(nums));    
}
}