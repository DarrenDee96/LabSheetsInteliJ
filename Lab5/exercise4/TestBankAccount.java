package Lab5.exercise4;
import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Richy Rich", 2342343 , 0.75 );

        JOptionPane.showMessageDialog(null, "Calling the no-argument BankAccount constructor. The " +
                "first BankAccount Object details are:\n\n" +  b1.toString() + "\n\n" +
                "Calling the multi-argument BankAccount constructor. The second BankAccount object details are:\n\n" +
                b2.toString());
    }
}
