package DataStructure.Arrays.StockBuyAndSell;

public class BestTimeStockBuyAndSellBetter {
    
    public static int maxProfit(int[] arr) {

        int maxpro = 0;
        int left = 0;
        int right = 1;

        while (right < arr.length) {
            if (arr[right] < arr[left]) {
                left = right;
            } else {
                int profit = arr[right] - arr[left];
                maxpro = Math.max(maxpro, profit);
            }

            right++;
        }

        return maxpro;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPr = maxProfit(arr);
        System.out.println("Max profit is: " + maxPr);
    }
}
