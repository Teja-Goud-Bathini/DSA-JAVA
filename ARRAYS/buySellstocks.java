public class buySellstocks {
    public static int profits(int prices[]){
        int maxprofit=0;
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=prices[i]-min;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={3,7,2,6,5,4,1};
       int maxprofit= profits(prices);
       System.out.println(maxprofit);
    }
}
