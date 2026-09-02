package Session09;

class FoodOrder 
{
    double amount;
    FoodOrder(double amount) 
    {
        this.amount = amount;
    }
    double calculateTotal() 
    {
        return amount;
    }
}
class ZomatoGoldOrder extends FoodOrder 
{
    ZomatoGoldOrder(double amount) 
    {
        super(amount);
    }
    @Override
    double calculateTotal() 
    {
        double total = super.calculateTotal();
        double discount = total * 0.10;
        return total - discount;
    }
}
public class Second 
{
	public static void main(String[] args) 
	{
		FoodOrder normalOrder = new FoodOrder(1000);
        ZomatoGoldOrder goldOrder = new ZomatoGoldOrder(1000);
        System.out.println("Normal Order Total: ₹" + normalOrder.calculateTotal());
        System.out.println("Zomato Gold Order Total: ₹" + goldOrder.calculateTotal());
	}
}
