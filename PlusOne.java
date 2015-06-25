public class Solution {
    public int[] plusOne(int[] digits) {
        int len, val=0;
        len=digits.length;
       // i=len-1;
        int []result=new int [len+1];
        int [] rr=new int [len];
        System.arraycopy(digits,0,result,1,digits.length);
        result[0]=0;
        val=result[len]+1;
        for(int i=len;i>=0;i--){
            result[i]=val % 10;
            if(val<10)
            break;
            else
            {
                val=result[i-1]+1;
                
            }
        }
        if(result[0]==0)
        {System.arraycopy(result,1,rr,0,rr.length);
        return rr;}
        else
        return result;
    }
    }
