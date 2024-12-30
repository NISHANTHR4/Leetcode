class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero_count=0;
        int start=0;
        int max_ones=0;
        for(int end=0;end<nums.length;end++)
        {
            if(nums[end]==0)
            {
                zero_count++;
            }
            while(zero_count>k)
            {
                if(nums[start]==0)
                {
                    zero_count--;
                }
                start++;
            }
            max_ones=Math.max(max_ones,end-start+1);
        }
        return max_ones;
    }
}