package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        //1
        String customername = JOptionPane.showInputDialog("Enter customer's name: ");
        //2
        double bill_amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter customer's bill: "));
        //3
        int is_member = JOptionPane.showConfirmDialog(null,
                "Do you have a member card?",
                "member",JOptionPane.YES_NO_OPTION);


        if (is_member == JOptionPane.YES_OPTION){  // if (is_member == 0)
            String member_Level = JOptionPane.showInputDialog("Enter a member level (gold/Premium): ");
            Member bill = new Member(customername,bill_amount,member_Level);
            JOptionPane.showMessageDialog(null,bill);

        }else {
            Regular bill = new Regular(customername,bill_amount);
            JOptionPane.showMessageDialog(null,bill);

        }


    }

}