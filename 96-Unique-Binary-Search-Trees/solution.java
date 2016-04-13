public class Solution {
    public int numTrees(int n) {
        if(n<=0)
        return 0;
        int [] count = new int [n+1];
        count[0]=1;
       // count[1]=1;
        for(int i=1;i<n+1;i++)//i is the number n
        {
            for(int j=0;j<i;j++)//[0-j] is the possible left child
            {
                count[i]+=count[j]*count[i-j-1];
            }
        }
        return count[n];
    }
  //  public void helper(int n,int num,)
}