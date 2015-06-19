import java.util.*;
public class Solution {
    public boolean isHappy(int n) {
        int  sum,nn,val;
        nn=n;
        if(n==0) return false;
        if(n==1) return true;
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
       // len= String.valueOf(n).length();
        while(n>1){
            sum=0;
        while(nn>0){
           val=nn % 10;
           sum+= val*val;
           nn=nn/10;
           System.out.println(sum);
        }
        if(!set.contains(sum)){
        if(sum==1)
        return true;
        else
        set.add(sum);
        nn=sum;
        }
        else 
        return false;

        }  
        return false;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isHappy(7));
		//System.out.println(s.isHappy(19));
		//System.out.println(s.isHappy(29));
	}
    
}