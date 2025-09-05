public class PracticesPeg {
        public int maxProfit(int[] prices) {
            int MinimumPrice=prices[0];
            int MaxPrice = -1;
            int n =prices.length;

            for(int i =1;i<n;i++){
                MaxPrice=Math.max(MaxPrice,prices[i]-MinimumPrice);
                MinimumPrice =Math.min(MinimumPrice,prices[i]);
            }
            return MaxPrice == -1?0:MaxPrice;


        }
        public static void main(String[]args){
            int prices[]={7,6,4,3,1};
            PracticesPeg  solution = new PracticesPeg();
            System.out.println(solution.maxProfit(prices));
        }
    }