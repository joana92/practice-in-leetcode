public class Solution {
    public int[] plusOne(int[] digits) {
        int len, val=0;
        len=digits.length;
        // i=len-1;
        int []result=new int [len+1];
        int [] rr=new int [len];
        System.arraycopy(digits,0,result,1,digits.length)
        val=result[len]+1;
        for(int i=len;i>=0;i--){
            if ((val>=10)){
                result[i] = val % 10;
                val=digits[i]+1;
                result[i]=val % 10;
            }
            else
            {
                if(i==len-1){
                    result[i+1]=val;
                }
                else
                    result[i+1]+=digits[i];
                break;
            }
            
        }
        if(result[0]==0){
            for(int j=1;j<len+1;j++){
                rr[j-1]=result[j];
            }
            return rr;
        }
        else
            return result;
        
    }
    
}
