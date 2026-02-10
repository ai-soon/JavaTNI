package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        return super.getBasePrice()
                + (whipped ? 15 : 0)
                + super.getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString()
                + (whipped ? "\nAdd whipped cream: 15 Baht" : "")
                + "\nTotal price = " + calculateFinalPrice() + " Baht.";
    }
}