import Easy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println("Hello World");
        
        PricesAfterDiscount test1 = new PricesAfterDiscount();
        System.out.println(Arrays.toString(test1.finalPrices(prices)));

    }
}
