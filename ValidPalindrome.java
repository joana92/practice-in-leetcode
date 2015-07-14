public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        String ss;
        int start,end;
     ss = s.replaceAll("[^0-9a-zA-Z]", "").toUpperCase();
     start=0; end=ss.length()-1;
     while(start<end){
         if(ss.charAt(start)!=ss.charAt(end)) 
         return false;
         else{
             start++;
             end--;
         }
     }
     return true;

        
    }
}
