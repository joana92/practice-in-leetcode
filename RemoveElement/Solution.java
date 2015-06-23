public class Solution {
    public int removeElement(int[] nums, int val) {
        int len,end,count,tem;
        len= nums.length;
        end=len-1;
        count=0;
        if(len==0) return 0;
        
        for(int i=0;i<len;i++){
            if(nums[i]==val){
                count++;
                while(true){
                    if(end<0) break;
                    if(nums[end]!=val) {
                        nums[i]=nums[end];
                        end--;
                        break;}
                    else
                        end--;
                }
                
            }
        }
        return (len-count);
        
    }
}