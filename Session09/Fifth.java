package Session09;

class Product 
{
    String name;
    Product(String name) 
    {
        this.name = name;
    }
    void displayProduct() 
    {
        System.out.println("Product Name: " + name);
    }
}

public class Fifth 
{
	public static void main(String[] args)
	{
		 Product p = new Product("Laptop");
	        p.displayProduct();
	}
}
