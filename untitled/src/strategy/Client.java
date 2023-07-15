package strategy;

public class Client {

    public static void main(String args[]) {
        System.out.println("Designing Strategy Design Pattern from - Behavioural Design Pattern");
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Car", "Hyderabad", "Banglore");
    }
}
