public class Solution {
    public int coinChange(int[] coins, int amount) {
    int [] value = new int [amount+1];
    // value [] means: to get value, how many coins do we need;
    value[0]=0;
    for(int coin:coins)
    {
       if(coin<=amount)
        value[coin]=1;
    }
    for(int i =1;i<=amount;i++)
    {
        if(value[i]==0)
        value[i]=Integer.MAX_VALUE;
    }
    //dp
    for(int i=1;i<=amount;i++)
        {
            for(int coin:coins)
            {
                if(coin<i && value[i-coin]!=Integer.MAX_VALUE)
                {
                    value[i]=Math.min(value[i],value[i-coin]+1);
                }
            }
        }
        if(value[amount]==Integer.MAX_VALUE)
        return -1;
        return value[amount];
    }
}