// 1. Trapping Rain Water
// Problem:
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// Java
// Copy
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6


class Rain{
    public static  int Min(int a , int b )
    {
        if( a > b)
        {
            return b;
        }
        return a;
    }

    public static void main(String args[])
    {
          int height[] = {0,1,0,2,1,0,1,3,2,3,1};
            int l=0;
            int r= 1; 
            int max=0;
            int count=1;
            while( r < height.length)
            {
                if( r == height.length - 1 )
                {
                       System.out.println("left " + height[l] +"  right "+height[r]+"max "+max+ " count "+count);
                       System.out.println("max = "+max);
                       return;                    
                }
                if( height[l] == 0 || height[r]== 0 )
                {
                     System.out.println("left " + l +"  right "+r+" max "+max +" count "+count);
                    l= r ;
                    r= r + 1;
                    count=1;
                }
                count= count + 1;
                max= Min(height[l] , height[r]) * count;
                r++;
                System.out.println("left " + height[l] +"  right "+height[r]+"max "+max+ " count "+count);
            }

          System.out.println("max = "+max);
    }
}