package Arrays;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        boolean buy = false;
        boolean sell = true;
        int buyingPrice = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(i==prices.length-1){
                if(buy){
                    if(prices[i]>prices[i-1]){
                        sell = true;
                        profit = profit + (prices[i]-buyingPrice);
                    }
                }
            }
            else if(prices[i+1]>prices[i]){
                if(sell){
                    buy=true;
                    sell = false;
                    buyingPrice = prices[i];
                }
            }else if(prices[i+1]<=prices[i]){
                if(buy){
                    sell = true;
                    buy = false;
                    profit = profit + (prices[i]-buyingPrice);
                }
            }
        }
        return profit;

    }

    public static void main(String [] args){
        int[] nums = {7,1,5,3,6,4};
        MaxProfit maxProfit = new MaxProfit();
        int length = maxProfit.maxProfit(nums);

        System.out.println("Maximum profit is: "+ length);
    }
}
