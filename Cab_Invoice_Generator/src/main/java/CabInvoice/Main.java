package CabInvoice;

public class Main {
    public static void main(String[] args) {
        CustomerDetail detail=new CustomerDetail(5,"Rahul","Rahul@12345","9876543213","Rahul123@gmail.com");
        detail.getDetails();

        InvoiceSummary summary=new InvoiceSummary(255,15);
        summary.getAverage();
    }
}
