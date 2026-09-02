package Session08;

class Product 
{
    String name;
    double price;
    Product() 
    {
        name = "Unknown Product";
        price = 0.0;
    }
    Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }
    Product(Product p) 
    {
        this.name = p.name;
        this.price = p.price;
    }
    void displayDetails() 
    {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println();
    }
}
public class First 
{
	public static void main(String[] args) 
	{
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 50000);
        Product p3 = new Product(p2);
        System.out.println("Product 1 - Default Constructor");
        p1.displayDetails();
        System.out.println("Product 2 - Parameterized Constructor");
        p2.displayDetails();
        System.out.println("Product 3 - Copy Constructor");
        p3.displayDetails();
	}
}
