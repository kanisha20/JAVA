package Session11;

public class Second 
{
    private String productName;
    private double price;
    private double discount;
    public String getProductName() 
    {
        return productName;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }
    public double getPrice() 
    {
        return price;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
    public double getDiscount() 
    {
        return discount;
    }
    public void setDiscount(double discount) 
    {
        this.discount = discount;
    }
    public double getFinalPrice() 
    {
        return price - (price * discount / 100);
    }
    public static void main(String[] args) 
    {
        Second p = new Second();
        p.setProductName("Smartphone");
        p.setPrice(20000);
        p.setDiscount(10);
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: ₹" + p.getPrice());
        System.out.println("Discount: " + p.getDiscount() + "%");
        System.out.println("Final Price: ₹" + p.getFinalPrice());
    }
}