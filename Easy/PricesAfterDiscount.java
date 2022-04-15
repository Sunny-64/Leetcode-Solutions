package Easy;
public class PricesAfterDiscount {
    public int[] finalPrices(int[] prices) {
        int[] finalPrice = new int[prices.length];
        for(int i = 0; i<prices.length-1; i++){
            for(int j = i+1; j<prices.length; j++){
                if(prices[j] <= prices[i]){
                    finalPrice[i] = prices[i] - prices[j];
                }
                else{
                    finalPrice[i] = prices[i];
                }
            }
        }
        return finalPrice;
    }
}
