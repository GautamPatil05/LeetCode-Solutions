class Solution {
    public int[] finalPrices(int[] prices) {
        int discount[] = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            boolean bool = true;
            for(int j = i+1; j < prices.length; j++) {
                
                if(prices[i] >= prices[j]) {
                    discount[i] = prices[i] - prices[j];
                    bool = false;
                    break;
                }
            }

            if(bool) {
                discount[i] = prices[i];
            }
        }
        return discount;

    }
}