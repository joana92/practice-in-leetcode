public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int len =nums.length;
        if(nums.length==0 || nums==null)
        return result;
        if(nums.length==1)
        {result.add(nums[0]);
         return result;        
        }
        if(nums.length==2)
        {
            if(nums[0]==nums[1])
            {result.add(nums[0]);
             return result;
            } 
            else
            {
                result.add(nums[0]);
                result.add(nums[1]);
                return result;
            }
        }
        
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(candidate1==nums[i])
            {count1++;}
            else if(candidate2==nums[i])
            {count2++;}
            else if(count1==0)
            {
                candidate1=nums[i];
                count1++;
            }
            else if(count2==0)
            {
                candidate2=nums[i];
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
       count1=0;
       count2=0;
       for (int i = 0; i < len; i++) {
        if (nums[i] == candidate1)
            count1++;
        else if (nums[i] == candidate2)
            count2++;
    }
    if (count1 > len / 3)
        result.add(candidate1);
    if (count2 > len / 3)
        result.add(candidate2);
    return result;

        
    }
}