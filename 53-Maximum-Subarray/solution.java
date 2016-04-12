public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)
        return 0;
        if(nums.length==1)
        return nums[0];
        int [] maxSub = new int [nums.length];
        maxSub[0]=nums[0];
        int maxSum = maxSub[0];
        for(int i=1;i<nums.length;i++)
        {
            maxSub[i]=Math.max(nums[i],maxSub[i-1]+nums[i]);
            maxSum=Math.max(maxSub[i],maxSum);
        }
        return maxSum;
    }
}