package Session11;

abstract class FoodDatabase 
{
    abstract void saveOrder(int orderId, String food);
    abstract void getOrder(int orderId);
}
class MySQLFoodDatabase extends FoodDatabase 
{
    @Override
    void saveOrder(int orderId, String food) 
    {
        System.out.println("Order " + orderId + " saved in database.");
        System.out.println("Food: " + food);
    }
    @Override
    void getOrder(int orderId) 
    {
        System.out.println("Getting order " + orderId + " from database.");
    }
}
class OrderService 
{
    FoodDatabase database;
    OrderService(FoodDatabase database) 
    {
        this.database = database;
    }
    void placeOrder(int orderId, String food) 
    {
        System.out.println("Placing order...");
        database.saveOrder(orderId, food);
    }
    void viewOrder(int orderId) 
    {
        database.getOrder(orderId);
    }
}
public class Fifth 
{
    public static void main(String[] args) 
    {
        FoodDatabase database = new MySQLFoodDatabase();
        OrderService service = new OrderService(database);
        service.placeOrder(101, "Pizza");
        System.out.println();
        service.viewOrder(101);
    }
}