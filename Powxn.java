public class Powxn {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0; 
        if(n==1) return x;
    double half = myPow(x, n/2);  
   if(n>0){
    if (n%2 == 0)  
    {  
        return half*half;  
    }  
    else if (n%2 == 1)  
      return half*half*x;  
   }
   if(n<0){
       if(n%2==0)
       return half*half;
       else
       return half*half/x;
   }
      
      return 0;  
    }
}
