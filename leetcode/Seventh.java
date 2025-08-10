// Given an integer array nums, return all the triplets
//  [nums[i], nums[j], nums[k]] such that i != j, i != k, 
//  and j != k, and nums[i] + nums[j] + nums[k] == 0.
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Seventh
{
    public static  List<List<Integer>> findTriplets(int[] nums)
    {
        Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for( int i=0; i< nums.length - 2 ;  i++)
    {
        if( i > 0  && nums[i] == nums[i + 1]) continue; 

        int left = i + 1;
        int right = nums.length - 1;
         while(left < right )
         {
            int sum = nums[i]+ nums[left] + nums[right];
            if( sum == 0)
            {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                while(left < right && nums[left] == nums[left + 1]) left++;
                while(left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
                
            }
            else if( sum < 0)
            {
                left++;
            }
            else
            {
                right--;
            }
         }
    }
    return result;

    }
    public static void main(String args[])
    {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets that sum to zero:"+findTriplets(nums));
    }
}