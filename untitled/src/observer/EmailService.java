package observer;

public class EmailService implements OnOrderPlacedSubscriber{
    @Override
    public void anOrderPlaced() {
        System.out.println("Sending Email");
    }
}
