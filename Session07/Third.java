package Session07;

class FoodOrder 
{
    String items = "";
    void addItem(String itemName) 
    {
        items = items + itemName + ", ";
        System.out.println(itemName + " added to order");
    }
    void getOrderSummary() 
    {
        System.out.println("Order Summary: " + items);
    }
}

public class Third 
{
	public static void main(String[] args) 
	{
		 FoodOrder order = new FoodOrder();
	        order.addItem("Pizza");
	        order.addItem("Burger");
	        order.addItem("French Fries");
	        order.getOrderSummary();	
	}
}
