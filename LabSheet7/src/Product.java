public class Product {
    public String name;
    public double price = 0;
    public int quantity = 0;

    public void addStock(int amount)
    {
        System.out.println();
        quantity+=amount;
        System.out.println("Added "+ amount + " item to stock");
    }

    public void sell(int amount)
    {
        if (amount<=quantity)
        {
            System.out.println("Sold "+ amount + " items");
            quantity+=amount;
        }
        else
        {
         System.out.println("Not enough item in stock...");
        }
    }

    public void changePrice(double newPrice)
    {
        if(newPrice>0)
        {
            price = newPrice;
            System.out.println("Change price to "+price+" Baht");
        }
    }

    public double stockvalue()
    {
        return price*quantity;
    }

    public void showInfo()
    {
        System.out.println("Name    : "+name);
        System.out.println("Price   : "+price+" Baht/Item");
        System.out.println("Stock   : "+quantity+" Items");
        System.out.println("Stock Value  : "+stockvalue()+" Baht");
    }
}
