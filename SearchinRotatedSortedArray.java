//reference:http://algorithm.yuanbin.me/binary_search/search_in_rotated_sorted_array.html
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
    int len=nums.length;
    if(nums==null | len==0) return -1;
    if(len==1){
        if(nums[0]==target) return 0;
        else return -1;
    }
    int start=0;
    int end=len-1;
    int mid;
    if(nums[0]<nums[len-1]){//not roated
      while(start+1<end){
        mid=start+(end-start)/2;
        if(target>nums[mid]) start=mid;
        if(target<nums[mid]) end=mid;
        if(target==nums[mid]) return mid;
    }
    if(nums[start]==target) return start;
    if(nums[end]==target) return end;
    return -1;
    }
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
        if(nums[mid]==target) return mid;
    }
    if(nums[start]==target) return start;
    if(nums[end]==target) return end;
    return -1;
    }
}
