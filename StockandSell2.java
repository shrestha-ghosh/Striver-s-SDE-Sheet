import java.util.*;

public class StockandSell2 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
    
        int res = maxProfit(arr);
        System.out.println("Max profit is: " + res);
    
        }
        static int maxProfit(int[] prices) {
            int res = 0;
            int start = prices[0];
            int len = prices.length;
            for(int i = 1;i<len; i++){
                if(start < prices[i]) res = res + prices[i] - start;
                start = prices[i];
            }
            return res;
        }
}
