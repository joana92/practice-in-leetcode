public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int len=nums.length;
        if(nums==null|len==0) return -1;
        if(len==1) return nums[0];
        int start=0;
        int end=len-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(nums[mid]<nums[end]){
                end=mid;
            }
            else if(nums[mid]>nums[end]){
                start=mid;
            }
        }
        if(nums[start]>nums[end])
        return nums[end];
    //    else if(nums[start]<nums[end])
    return nums[start];
    
    }
}
