package Session14;

class OutOfStockException extends Exception 
{
    OutOfStockException(String message) 
    {
        super(message);
    }
}
class Product 
{
    String productName;
    int stock;
    Product(String productName, int stock) 
    {
        this.productName = productName;
        this.stock = stock;
    }
    void buyProduct(int quantity) throws OutOfStockException 
    {
        if (quantity > stock) 
        {
            throw new OutOfStockException("Out of Stock! Only " + stock + " items are available.");
        }
        stock = stock - quantity;
        System.out.println("Product: " + productName);
        System.out.println("Quantity purchased: " + quantity);
        System.out.println("Remaining stock: " + stock);
        System.out.println("Purchase successful!");
    }
}
public class First 
{
    public static void main(String[] args) 
    {
        Product p = new Product("Smartphone", 5);
        try 
        {
            p.buyProduct(7);
        }
        catch (OutOfStockException e) 
        {
            System.out.println("Purchase failed!");
            System.out.println(e.getMessage());
        }
    }
}