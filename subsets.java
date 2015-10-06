public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        ArrayList<Integer> path = new ArrayList<Integer>();
        subsetsHelper(nums, 0, path, result);
        return result;
    }
    
    private void subsetsHelper(int[] nums, int pos, ArrayList<Integer> path, 
    List<List<Integer>> result) {
        result.add(new ArrayList<Integer>(path));
        
        for (int i = pos; i < nums.length; i++) {
            path.add(nums[i]);
            subsetsHelper(nums, i + 1, path, result);
            
            path.remove(path.size() - 1);
        }
    }
        
    }
