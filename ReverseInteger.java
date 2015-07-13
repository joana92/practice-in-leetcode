public class ReverseInteger {
    public int reverse(int x) {
        int flag;
        long result=0,xx,tem;
        if (x==0) return 0;
        xx=x;
        if(xx<0) 
        {
            flag=-1;
            xx=flag*xx;
        }
        else flag=1;
        while(xx>0){
            result*=10;
            tem=xx % 10;
            result=result+tem;
            xx=xx/10;
        }
        if(result>Integer.MAX_VALUE) return 0;
        else return (((int)result)*flag);
        
        
    }
}
