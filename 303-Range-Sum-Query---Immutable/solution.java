public class NumArray {
    long []presum;
    
    public NumArray(int[] nums) {
        presum = new long [nums.length];
        //presum[0]= nums[0];
        long sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            presum[i]=sum;
        }
        
    }

    public int sumRange(int i, int j) {
        if(i==0)
        return (int)presum[j];
        else
        return (int)(presum[j]-presum[i-1]);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);