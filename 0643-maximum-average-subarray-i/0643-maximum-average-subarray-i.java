class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,avg=0;
        int c=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        avg=sum/k;
        double maxAvg=avg;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[c];
            c++;
            avg=sum/k;
            if(maxAvg<avg)
            {
                maxAvg=avg;
            }
        }
    return maxAvg;
    }
}