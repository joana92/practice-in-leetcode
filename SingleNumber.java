public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int one=nums[0];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else
            {
                set.add(nums[i]);
            }
        }
        for(Integer s: set){
            one=s;
        }
        return one;
        
    }
}
