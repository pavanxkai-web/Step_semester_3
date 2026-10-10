public class BestTimeToBuyAndSellStock {
    static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int p : prices) { min = Math.min(min, p); profit = Math.max(profit, p - min); }
        return profit;
    }
    public static void main(String[] args) { System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); }
}
