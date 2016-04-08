public class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)
        return result;
        List<Integer> candidate = new ArrayList<>();
        helper(nums,result,candidate);
        return result;
        
    }
    
    public void helper(int []nums, List<List<Integer>> result, List<Integer>candidate)
    {
        if(candidate.size()==nums.length)
        {result.add(new ArrayList<Integer>(candidate));
        return;}
        
        for(int i=0;i<nums.length;i++)
        {
            if(candidate.contains(nums[i]))
            continue;
            else
            {
             candidate.add(nums[i]);
             helper(nums,result,candidate);
             candidate.remove(candidate.size()-1);
                
            }
        }
    
    }
}