public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 ||x>=Integer.MAX_VALUE) return false;
        long xx,result=0;
      //  if(x<0) x=x*x;
        xx=x;
        while(xx>0){
            result*=10;
            result+=xx % 10;
            xx=xx/10;
        }
        if (result>=Integer.MAX_VALUE) return false;
        if((result-(long)x)==0) return true;
        else return false;
    }
}
