class Ninth {
    public static  int searchInsert(int[] nums, int target) {
        for ( int i=0 ; i < nums.length ;  i++)
        {
            if( nums[i] == target )
            {
                return i;
            }
            else if( nums[i] < target )
            {
             continue;
            }else
            {
                return i ;
            }
        }
        return nums.length;
    }
    public static  void main (String args[])
    {
        int arr[]={3,7,9,10,11};
        int res = searchInsert( arr , 7);
        System.out.println(" the   position "+res);
    }
}