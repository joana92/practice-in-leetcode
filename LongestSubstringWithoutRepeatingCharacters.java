//reference: http://blog.csdn.net/likecool21/article/details/10858799
public class LongestSubstringWithoutRepeatingCharacters  {
    public int lengthOfLongestSubstring(String s) {
        /*HashMap<Character,Integer> map=new HashMap<>();
        int len,end,start,max;
        start=0;
        end=1;
        max=0;
        len=s.length();
        if(len<=1) return len;
        map.put(s.charAt(start),0);
        while(end<len){
            if(!map.containsKey(s.charAt(end))){
                map.put(s.charAt(end),end);
                end++;
            }
            else{
                max=Math.max(max,map.size());
                start=map.get(s.charAt(end))+1;
                map.clear();
                map.put(s.charAt(start),start);
                end=start+1;
            }
        }*/
  int length = s.length();  
        if (length == 0) {  
            return 0;  
        }  
        int [] countTable = new int[256];  
        Arrays.fill(countTable, -1);  
        int max = 1;  
        int start = 0;  
        int end = 1;  
          
        countTable[s.charAt(0)] = 0;  
        while (end < length) {  
            //Has not reached a duplicate char  
            if (countTable[s.charAt(end)] >= start) {  
                start = countTable[s.charAt(end)] + 1;                
            }  
            max = Math.max(max, end - start + 1);  
            countTable[s.charAt(end)] = end;  
            end++;  
    }
     return max;
    }
}
