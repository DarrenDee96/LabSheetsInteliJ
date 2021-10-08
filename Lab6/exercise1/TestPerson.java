package Lab6.exercise1;
import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
     String output ="" , out2 = "" , name1 = "",name2 = "";

        Person p1 = new Person();

        output += p1.toString();


        name1 = JOptionPane.showInputDialog("Please enter the first Name of the second person");
        name2 = JOptionPane.showInputDialog("Please enter the last Name of the second person");

        Person p2 = new Person(name1 , name2);

        out2 += p2.toString();

        JOptionPane.showMessageDialog(null, "***** Person Class Tester ****** \n\n\nCalling" +
                " the person() constructor..... \n" + output + "\n\n Calling the Person(String, String) constructor after getting user supplied values....\n" + out2);

    }
}
