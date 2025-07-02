class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
       
        Arrays.sort(nums);
        int res[]=new int[n];
       
        for(int i=0;i<n-1;i=i+2){
            for(int j=i+1;j<n;j=j+2){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        return nums;
    }
}