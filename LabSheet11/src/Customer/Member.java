package Customer;

public class Member extends Customer implements Rewardable{

    private String member_Level;

    public Member (String name,double billAmount,String member_Level){
        super(name,billAmount);
        this.member_Level = member_Level;

    }

    @Override
    public double calculateFinalBill() {
        return getBillAmount() - (getBillAmount() * getDiscountRate());

    }

    public String toString(){
        return super.toString()+
                "\nMember Level: " + member_Level + "(Discount rate" + getDiscountRate() + ")" +
                "\nGet Point:    " + collectPoint() +
                "\nTotal price:  " + calculateFinalBill();

    }

    @Override
    public double getDiscountRate() {
        if (member_Level.equalsIgnoreCase("gold"))
            return 0.15;
        if (member_Level.equalsIgnoreCase("premium"))
            return 0.20;
        return 0;
    }

    @Override
    public int collectPoint() {

        return (int) (calculateFinalBill() / 100);

    }
}