public class VolumeOfEarth {
    public static void main(String args[]){
        double radius=6378;
        double pi= Math.PI;
        double volume= (4.0/3.0) * pi * Math.pow(radius,3);
        double volumeInMiles = volume * Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometer is "+ volume + " and cubic miles is " + volumeInMiles);

    }
}
