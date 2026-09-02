package Session06;

class Product 
{
    String productName;
    double price;
    Product(String productName, double price) 
    {
        this.productName = productName;
        this.price = price;
    }
}
public class Frist 
{
    public static void main(String[] args) 
    {
        Product p = new Product("Laptop", 55000.50);
        System.out.println("Product Name: " + p.productName);
        System.out.println("Price: ₹" + p.price);
    }
}