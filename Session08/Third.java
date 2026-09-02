package Session08;

class CartItem 
{
    String productId;
    int quantity;
    CartItem(String productId) 
    {
        this.productId = productId;
        this.quantity = 1;
    }
    CartItem(String productId, int quantity) 
    {
        this.productId = productId;
        this.quantity = quantity;
    }
    CartItem(CartItem item) 
    {
        this.productId = item.productId;
        this.quantity = item.quantity;
    }
    void displayItem() 
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}
public class Third
{
	public static void main(String[] args) 
	{
        CartItem item1 = new CartItem("P101");
        CartItem item2 = new CartItem("P102", 3);
        CartItem item3 = new CartItem(item2);
        System.out.println("Item 1 - Product ID Only:");
        item1.displayItem();
        System.out.println("Item 2 - Product ID and Quantity:");
        item2.displayItem();
        System.out.println("Item 3 - Copy of Item 2:");
        item3.displayItem();
	}
}
