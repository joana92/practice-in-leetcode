public class SummaryRange {
    public List<String> summaryRanges(int[] nums) {
        int head=0, rear=0;
        String tem="";
        List <String> list = new ArrayList<>(); 
        if(nums.length<=0)
            return list;
        
       while(head<nums.length & rear<nums.length){

        if((rear< nums.length-1) && (nums[rear+1]==(nums[rear]+1)))
        rear++;
        else
        {
            if(head==rear)
            {
                tem=Integer.toString(nums[head]);
                list.add(tem);
                head++;
                rear++;
            }
            else
            {
                tem=Integer.toString(nums[head])+"->"+Integer.toString(nums[rear]);
                list.add(tem);
                head=rear+1;
                rear++;
            }
        }
        
    }
    return list;
    }
}
