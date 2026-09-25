class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        int min =Integer.MAX_VALUE;
        int second_min =Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(prices[i]<min) {
                second_min=min;
                min=prices[i];
            }
            else if(prices[i]<second_min){
                second_min=prices[i];
            }
        }
        int cost=min+second_min;
        if(cost<=money){
            return money-cost;
        }
        return money;

        
    }
}