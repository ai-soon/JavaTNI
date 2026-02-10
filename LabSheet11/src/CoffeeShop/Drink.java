package CoffeeShop;

public abstract class Drink implements Priceable {

    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName, double basePrice, String size) {
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size.trim().toLowerCase();
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public double getSizeExtra() {
        switch (size) {
            case "s": return 0;
            case "m": return 10;
            case "l": return 15;
            default:  return 0; // ถ้าผิด → ไม่บวกเพิ่ม
        }
    }

    public abstract double calculateFinalPrice();

    @Override
    public String toString() {
        return "Your order: " + this.drinkName + " (Size: " + size.toUpperCase() + ")";
    }
}