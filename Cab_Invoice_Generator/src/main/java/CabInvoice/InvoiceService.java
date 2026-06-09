package CabInvoice;
import java.util.*;
public class InvoiceService {
    HashMap<String,ArrayList<Ride>> rideMap=new HashMap<>();
    public void  addRide(Ride ride,String user_id){
       rideMap.computeIfAbsent(user_id,k->new ArrayList<>()).add(ride);
    }
    public InvoiceSummary getInvoice(String user_id){
        FareGenerator generator=new  FareGenerator();
        return generator.calculateFare(rideMap.get(user_id));
    }
}
