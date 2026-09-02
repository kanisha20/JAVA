package Session06;


class CartItem 
{
    String itemName;
    int quantity;
    CartItem(String itemName, int quantity) 
    {
        this.itemName = itemName;
        this.quantity = quantity;
    }
    void increaseQuantity() 
    {
        quantity++;
        System.out.println("Updated Quantity of " + itemName + ": " + quantity);
    }
}
public class Third 
{
	public static void main(String[] args) 
	{
		CartItem item = new CartItem("T-Shirt", 1);

        item.increaseQuantity();
        item.increaseQuantity();
	}
}
