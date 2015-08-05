public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
       int len=nums.length;
    if(nums==null | len==0) return false;
    if(len==1){
        if(nums[0]==target) return true;
        else return false;
    }
    int start=0;
    int end=len-1;
    int mid;
    
    while(start+1<end){
        mid=start+(end-start)/2;
        if(nums[start]<nums[mid]){
            if(target>=nums[start] && target<nums[mid])
            end=mid;
            else
            start=mid;
        }
        if(nums[start]>nums[mid]){
            if(target>nums[mid] && target<=nums[end])
            start=mid;
            else
            end=mid;
        }
        if(nums[mid]==target) return true;
        if(nums[start]==nums[mid])
        start++;
    }
    if(nums[start]==target) return true;
    if(nums[end]==target) return true;
    return false; 
        
    }
}
