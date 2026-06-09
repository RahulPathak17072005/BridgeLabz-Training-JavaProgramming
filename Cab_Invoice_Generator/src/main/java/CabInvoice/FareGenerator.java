package CabInvoice;
import java.util.*;
public class FareGenerator {

    public double calculateFare(Ride ride){
        double fare;
        if(ride.type.equals("Premium")){
            fare=ride.distance*15+ride.time*2;
            return Math.max(fare,20);
        }else if(ride.type.equals("Normal")){
            fare=ride.distance*10+ride.time;
            return Math.max(fare,5);
        }else{
            fare=0;
            return Math.max(fare,0);
        }
    }

    public InvoiceSummary calculateFare(ArrayList<Ride> rides){
        double fare=0;
        for(Ride ride:rides){
            fare+=calculateFare(ride);
        }
        return new InvoiceSummary(fare,rides.size());

    }


}
