class  Container  {
    public static int maxArea(int[] height) {

    int left=0; 
    int right = height.length -1;
    int max=0;
    int counter =height.length -1;

    while ( counter >0 )
    {
        int area=0;
        if(height[left] < height[right])
        {
            area= counter *  height[left];
            left++;

        }else
        {
            area= counter *  height[right];
            right--;

        }
        max= Math.max(max , area);
        counter--;

    }

    return max;
        
    }
    public static void main(String args[])
    {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(" "+ maxArea(height));
    }
}