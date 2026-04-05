public class ProfitCalculation {
    public static void main(String[] args){
        int costPrice = 129 , sellingPrice = 191 ;
        int profit = sellingPrice - costPrice ;
        double profitPercentage = (profit / (double)costPrice) * 100;
        System.out.println(
            "The cost price is INR " + costPrice + ", the selling price is INR " + sellingPrice + ", the profit is INR " + profit + ", and the profit percentage is " + profitPercentage
        );
    }
}
