package Lab5.exercise1;

import javax.swing.*;
import java.awt.*;
import Lab4.exercise1.Computer;

public class TestBook {
    public static void main(String[] args) {
        String output = "", title, ISBN ;
        double  price;
        int pages;

        Computer c1 = new Computer();

        //System.out.print(c1.getManufacturer());

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-15s%s","Title","Price","ISBN","Pages"));



        title =JOptionPane.showInputDialog(null, "Please enter the title of your favourite book");


        price = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of your favourite book"));


        ISBN =JOptionPane.showInputDialog(null, "Please enter the ISBN of your favourite book");


        pages = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter how many pages are in your favourite book"));

        Book favourite = new Book(title, price , ISBN , pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d" , favourite.getTitle(), favourite.getPrice(), favourite.getISBN(), favourite.getPages());



        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));

        Book leastFavouriteBook = new Book(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d",leastFavouriteBook.getTitle(),leastFavouriteBook.getPrice(),
                leastFavouriteBook.getISBN(),leastFavouriteBook.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);


        // Book b1 = new Book();

       /// output = "Calling the no-argument Book constructor. The first book details are: \n\n" + b1.toString();

       // Book b2 = new Book("The DaVinci Code", 19.99, "3452617232", 348);

     //   output += "\n\nCalling the multiline-argument Book constructor. THe second Book object details are: \n\n" + b2.toString();



        //JOptionPane.showMessageDialog (null,  output , "Book Object Data", JOptionPane.INFORMATION_MESSAGE );



    }

}
