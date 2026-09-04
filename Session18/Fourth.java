package Session18;

class OrderUpdate extends Thread
{
    public void run()
    {
        System.out.println("Order Update: Food is being prepared.");
    }
}
class Notification extends Thread
{
    public void run()
    {
        System.out.println("Notification: Your order has been accepted!");
    }
}
class DeliveryTime extends Thread
{
    public void run()
    {
        System.out.println("Delivery Time: Estimated delivery in 30 minutes.");
    }
}
public class Fourth
{
    public static void main(String[] args)
    {
        OrderUpdate order = new OrderUpdate();
        Notification notification = new Notification();
        DeliveryTime delivery = new DeliveryTime();
        order.start();
        notification.start();
        delivery.start();
    }
}