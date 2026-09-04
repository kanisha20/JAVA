package Session16;

import java.util.ArrayList;

class Product
{
    String name;
    double price;
    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
}
public class Third
{
    static void calculateTotal(ArrayList<Product> cart)
    {
        double total = 0;
        for (Product p : cart)
        {
            System.out.println(p.name + " - ₹" + p.price);
            total = total + p.price;
        }
        System.out.println("----------------------");
        System.out.println("Total Cart Value: ₹" + total);
    }
    public static void main(String[] args)
    {
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(new Product("Smartphone", 15000));
        cart.add(new Product("Headphones", 2000));
        cart.add(new Product("Keyboard", 1200));
        cart.add(new Product("Mouse", 800));
        cart.add(new Product("Power Bank", 1500));
        System.out.println("Flipkart Shopping Cart:");
        System.out.println("----------------------");
        calculateTotal(cart);
    }
}