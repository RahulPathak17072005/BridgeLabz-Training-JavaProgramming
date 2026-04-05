public class DiscountAmount {
    public static void main(String[] args){
    int fee= 125000;
    int discountPercentage = 10;

    double discount= (fee * discountPercentage) / 100.0;
    double finalFee =  fee - discount;
    System.out.println(
        " The discount amount is INR"+ discount + " and final discounted fee is INR " +finalFee
    );
}

}
