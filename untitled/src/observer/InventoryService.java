package observer;

public class InventoryService implements OnOrderPlacedSubscriber{
    @Override
    public void anOrderPlaced() {
        System.out.println("Updating Inventory");
    }
}
