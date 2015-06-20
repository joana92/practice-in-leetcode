import java.util.*;
public class Solution {
    public int rob(int[] nums) {
        int len,sum1,sum2,sumi=0;
        len=nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);
        sum1=nums[0];sum2=Math.max(nums[1],nums[0]);
        for(int i=2; i<len; i++){
            sumi=Math.max((sum1+nums[i]),sum2);
            sum1=sum2;
            sum2=sumi;
        }
        return sumi;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] houses;
        
        houses = new int[] {2, 2, 1};
        System.out.println(s.rob(houses));
        
        houses = new int[] {2, 1, 1, 2};
        System.out.println(s.rob(houses));
    }
}