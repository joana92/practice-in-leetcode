public class Solution {
    public int maxProfit(int[] prices) {
                if(prices==null || prices.length<2)
        return 0;
        int minPrice = prices[0];
        int maxPro = 0;
        for(int i=1;i<prices.length;i++)
        {
            maxPro = Math.max(maxPro,prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxPro;
    }
}