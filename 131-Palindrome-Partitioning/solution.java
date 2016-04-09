public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (s==null || s.length()==0)
        return result;
        List<String> candidate = new ArrayList<String>();
        helper(s,result,candidate,0);
        return result;
        
    }
    
    public void helper(String s, List<List<String>>result, List<String>candidate,int pos)
    {
        if(pos==s.length())
        result.add(new ArrayList<String>(candidate));
        
        for(int i=pos;i<s.length();i++)
        {
            String cur = s.substring(pos,i+1);
            if(!isPalindrome(cur))
            continue;
           
            candidate.add(cur);
            helper(s,result,candidate,i+1);
            candidate.remove(candidate.size()-1);
            
        }
    }
    private boolean isPalindrome (String s)
    {
        int start = 0;
        int end = s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }
}