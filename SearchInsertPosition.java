public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums==null) return -1;
        int len=nums.length;
        if(len==0) return 0;
        int start=0; 
        int end=len-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(target>nums[mid]) 
           { start=mid;}
            if(target<nums[mid])
           { end=mid;}
            else if(target==nums[mid])
            {return mid;}
        }
        if(nums[start]>=target)
        return start;
        if(nums[end]<target)
        return end+1;
       // if(nums[start]<target)
        return end;
       // if(nums[end]>)
        
    }
}
