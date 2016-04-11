public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length ==0) {
            return result;
        }
        Arrays.sort(nums);
        subsetsHelper(result, list, nums, 0);

        return result;
    }

    private void subsetsHelper(List<List<Integer>> result,
        List<Integer> list, int[] num, int pos) {

        result.add(new ArrayList<Integer>(list));
        int pre =-1;
        for (int i = pos; i < num.length; i++) {
            if(pre!=-1 && num[i]==pre)
            continue;
            list.add(num[i]);
            subsetsHelper(result, list, num, i + 1);
            list.remove(list.size() - 1);
            pre=num[i];
        }
    }
}