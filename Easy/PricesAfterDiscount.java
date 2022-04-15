package Easy;
// https://leetcode.com/submissions/detail/680694136/
public class PricesAfterDiscount {
    public int[] finalPrices(int[] prices) {
        // brute force..
        int[] finalPrice = new int[prices.length];
        for(int i = 0; i<prices.length-1; i++){
            for(int j = i+1; j<prices.length; j++){
                if(prices[j] <= prices[i]){
                    finalPrice[i] = prices[i] - prices[j];
                    break;
                }
                else{
                    finalPrice[i] = prices[i];
                }
            }
        }
        finalPrice[prices.length-1] = prices[prices.length-1];
        return finalPrice;
    }
}
