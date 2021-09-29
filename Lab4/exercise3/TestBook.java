package Lab4.exercise3;
import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output;

        Book b1 = new Book();

        output = "Calling the no-argument Book constructor. The first book details are: \n\n" + b1.toString();

        Book b2 = new Book("The DaVinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the multiline-argument Book constructor. THe second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog (null,  output , "Book Object Data", JOptionPane.INFORMATION_MESSAGE );



    }

}
