package observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber{
    @Override
    public void anOrderPlaced() {
        System.out.println("Generator invoice");
    }
}
