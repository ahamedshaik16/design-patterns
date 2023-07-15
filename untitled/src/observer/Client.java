package observer;

public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();

        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        flipkart.registerSubscriber(emailService);
        flipkart.registerSubscriber(inventoryService);
        flipkart.registerSubscriber(invoiceGenerator);

        flipkart.onOrderPlaced();
    }
}
