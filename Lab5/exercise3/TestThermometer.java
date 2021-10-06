package Lab5.exercise3;
import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        int temperature;

        Thermometer t1 = new Thermometer(35);

        Thermometer t2 = new Thermometer();

        t2.setCurrentTemp(0);

        Thermometer t3 = new Thermometer();

        t3.setTemperature(25);

        JOptionPane.showMessageDialog(null , "****Thermometer Testing **** \n\n " +
                "Calling the single argument constructor... setting the temperature of the first thermometer to 35C\n" +
                "First Thermometer\nCurrent temperature: " + t1.getCurrentTemp() + "\nMaximum temperature: " + t1.getMaxTemp() + "\n" +
                "Minimum temperature: " + t1.getMinTemp() +"\n\nCalling the no-argument constructor... setting the temperature of the first thermometer to 0C\n" +
                "Second Thermometer\nCurrent temperature: " + t2.getCurrentTemp() + "\nMaximum temperature: " + t2.getMaxTemp() + "\n" +
                "Minimum temperature: " + t2.getMinTemp() + "\n\nCalling setTemperature... setting the temperature of the first thermometer to 25C\n" +
                "Third Thermometer\nCurrent temperature: " + t3.getCurrentTemp() + "\nMaximum temperature: " + t3.getMaxTemp() + "\n" +
                "Minimum temperature: " + t3.getMinTemp());


        temperature = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the current temperature of the first thermometer:"));

        Thermometer t4 = new Thermometer();

        t4.setTemperature(temperature);

        JOptionPane.showMessageDialog(null, "**** Thermometer Testing ****\n\n" +
                "Calling setTemperature().... setting the temperature of the first thermometer to " + temperature + "C\n" +
                "First Thermometer:\n Current temperature: " + t4.getCurrentTemp() + "\nMaximum temperature: " + t4.getMaxTemp() + "\n" +
                "Minimum temperature: " + t4.getMinTemp());

    }
}
