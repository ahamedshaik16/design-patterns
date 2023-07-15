package observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart flipkart = null;
    private Flipkart() {

    }

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscriberList = new ArrayList<>();

    public static Flipkart getInstance() {
        if(flipkart == null) {
            flipkart = new Flipkart();
        }
        return flipkart;
    }

    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscriberList.add(onOrderPlacedSubscriber);
    }

    void unregisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscriberList.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced() {
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber: onOrderPlacedSubscriberList) {
            onOrderPlacedSubscriber.anOrderPlaced();
        }
    }
}
