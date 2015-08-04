public class Sqrt {
    public int mySqrt(int x) {
        if(x==0) return 0;
      //  double xx=x;
      //  double max= xx/2+1;
        double cur=1;
        double last=0;
       // while(cur*cur != xx & cur<max){
       while(Math.abs(last*last-cur*cur)>0.1){
           last=cur;
            cur=(x+cur*cur)/(2*cur);
        }
        return (int) cur;
        
    }
}
