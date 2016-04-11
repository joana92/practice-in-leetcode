public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0 || nums==null)
        return 0;
        int left =0;
        int right=0;
        int sum=0;
        int minLen = Integer.MAX_VALUE;
        for(left =0; left< nums.length;left++)
        {
            while(right<nums.length && sum<s)
            {
                sum+=nums[right];
                right++;
            }
            if(sum>=s)
            {
                minLen = Math.min(minLen, right-left);
            }
            if(minLen<=1)
            break;
            sum-=nums[left];
        }
        if(minLen==Integer.MAX_VALUE)
        return 0;
        return minLen;
    }
}