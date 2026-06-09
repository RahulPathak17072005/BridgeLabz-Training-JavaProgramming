package CabInvoice;

public class InvoiceSummary {
double fare;
int ride;
double average;
public InvoiceSummary(double fare,int ride){
    this.fare=fare;
    this.ride=ride;
    this.average=fare/ride;
}
public void getAverage(){
    System.out.println("Average of the rides: "+ this.average);
}


}
