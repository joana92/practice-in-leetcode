public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        if(nums==null | len==0) 
        return new int[]{-1,-1};
        if(len==1){
            if(nums[0]==target) 
            return new int []{0,0};
            else 
            return new int []{-1,-1};
        }
        int start=0;
        int end=len-1;
        int mid;
        int [] result=new int [2];
        while(start+1<end){
            mid=start+(end-start)/2;
            if(target==nums[mid] | target<nums[mid]) //starting position
            end=mid;
            if(target>nums[mid])
            start=mid;
        }
        if(nums[start]==target & nums[end]==target) 
        result[0]=start;
        else if(nums[end]==target)
        result[0]=end;
        else if(nums[start]==target)
        result[0]=start;
        else
        result[0]=-1;
        start=0;
        end=len-1;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(target==nums[mid] | target>nums[mid])//ending position
            start=mid;
            if(target<nums[mid])
            end=mid;
        }
        if(nums[start]==target & nums[end]==target)
        result[1]=end;
        else if(nums[start]==target)
        result[1]=start;
        else if(nums[end]==target)
        result[1]=end;
        else
        result[1]=-1;
        return result;
        
        
    }
}
