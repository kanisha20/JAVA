package Session07;

class Product 
{
    String productName;
    double price;
    void addProduct(String name, double productPrice) 
    {
        productName = name;
        price = productPrice;
        System.out.println("Product added: " + productName);
    }
    void updateProduct(double newPrice) 
    {
        price = newPrice;
        System.out.println("Product price updated: " + price);
    }
}
class Customer 
{
    String customerName;
    String address;
    void addCustomer(String name, String customerAddress) 
    {
        customerName = name;
        address = customerAddress;
        System.out.println("Customer added: " + customerName);
    }
    void updateAddress(String newAddress) 
    {
        address = newAddress;
        System.out.println("Address updated: " + address);
    }
}
class Order 
{
    String orderId;
    String status;
    void createOrder(String id) 
    {
        orderId = id;
        status = "Order Placed";
        System.out.println("Order created: " + orderId);
    }
    void updateStatus(String newStatus) 
    {
        status = newStatus;
        System.out.println("Order status updated: " + status);
    }
}
public class Fifth 
{
	public static void main(String[] args) 
	{
        Product product = new Product();
        product.addProduct("Laptop", 50000);
        product.updateProduct(48000);
        Customer customer = new Customer();
        customer.addCustomer("Kanisha", "Ahmedabad");
        customer.updateAddress("Jivrajpark, Ahmedabad");
        Order order = new Order();
        order.createOrder("01");
        order.updateStatus("Shipped");
	}
}
