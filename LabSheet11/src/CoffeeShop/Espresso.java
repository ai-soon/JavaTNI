package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

    public Espresso(String size, boolean extraShot) {
        super("Espresso", 35, size);
        this.shot = 0;

        if (extraShot) {
            this.shot = 1;
        }
    }

    public int getShot() {
        return this.shot;
    }

    public void addShot(int shot) {
        this.shot += shot;   // เพิ่มตามจำนวนที่ส่งมา
    }

    public double calculateFinalPrice() {
        return super.getBasePrice() + (this.shot * 15) + super.getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString() +
                (shot > 0 ? "\nAdded " + this.shot + " shot(s)" : "") +
                "\nTotal price = " + calculateFinalPrice() + " Baht.";
    }
}