public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int []index=new int [2];
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                index[0]=map.get(nums[i])+1;
                index[1]=i+1;
                break;
            }
            else{
                map.put((target-nums[i]),i);
            }
        }
        return index;
        
    }
}
