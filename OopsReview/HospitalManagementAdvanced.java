package OopsReview;
interface Insurable{
   void claimInsurance(double amount);
}
interface Discountable{
    void applyDiscount(double pct);
}
abstract class BillingProfile{
    private int patientId;
    private String patientName;
    public BillingProfile(int patientId,String patientName){
        this.patientId=patientId;
        this.patientName=patientName;
    }
    public int getPatientId(){
        return patientId;
    }
    public String getPatientName(){
        return patientName;
    }
    abstract double calculateBill(double baseCost);
    public void printSummary(){
        System.out.println("Patient ID: "+patientId);
        System.out.println("Patient Name: "+patientName);
    }
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        BillingProfile other = (BillingProfile) obj;
        return this.patientId==other.patientId;

    }
}



class GeneralPatient extends BillingProfile implements Discountable{
public GeneralPatient(int id,String name){
    super(id,name);
}
public double calculateBill(double baseCost){
    return baseCost;
}
public void applyDiscount(double pct){
    System.out.println(pct);
}
}



class ICUPatient extends BillingProfile implements Discountable{
    public ICUPatient(int id,String name){
        super(id,name);
    }
        public double calculateBill(double baseCost){
            return baseCost*1.5;
        }
        public void applyDiscount(){
            System.out.println("default");
        }
        public void applyDiscount(double pct){
            System.out.println(pct);
        
        }
        public void applyDiscount(String reason, double pct){
            System.out.println("the discount is: "+pct +" after reason "+reason);
        }
    }
class InsuredPatient extends BillingProfile implements Insurable{
private double coveragePct;
public InsuredPatient(int id,String name,double coveragePct){
    super(id,name);
    this.coveragePct=coveragePct;

}
public double calculateBill(double baseCost){
    double payable=baseCost*(1-coveragePct/100);
return payable;
}
public void claimInsurance(double amount){
    System.out.println(amount);
}

}


public class HospitalManagementAdvanced {
public static void main(String[] args) {
    
BillingProfile[] patients={
    new GeneralPatient(100,"Ram"),
    new ICUPatient(101, "Shyam"),
    new InsuredPatient(102, "ravi", 40)
};
for(BillingProfile p : patients){
    p.printSummary();
    double bill=p.calculateBill(5000);
    System.out.println(bill);
}
ICUPatient icu =new ICUPatient(104,"Dinesh");
icu.applyDiscount();
icu.applyDiscount(10);
icu.applyDiscount("Ayushman card", 15);
}
    
}