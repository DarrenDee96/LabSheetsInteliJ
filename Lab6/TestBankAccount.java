package Lab6;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        String output = "Calling the no-argument BankAccount constructor. The " +
                "first BankAccount Object details are:\n\n" +  b1.toString() + "\n\n";
        BankAccount b2 = new BankAccount("Richy Rich", 2342343 , 0.75 );
        output +=  "Calling the multi-argument BankAccount constructor. The second BankAccount object details are:\n\n" +
                b2.toString();
        BankAccount.setInterestRate(0.5);
       double b= BankAccount.getInterestRate();
        output += "\n\nNow calling the setInterestRate() Method to change the interest rate to 0.5\n\n" + b1.toString() ;

        output += "\n\nThe second BankAccount object details are: \n\n" + b2.toString();
        JOptionPane.showMessageDialog(null, output );

    }
}
