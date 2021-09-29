package Lab4;
import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {
    double massOfOther, massOfEarth, radiusOfEarth, radiusOfPlanet, accel;
    final double g = 9.81;
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the mass of planet Earth: ");
    massOfEarth= input.nextDouble();

    System.out.print("Please enter the radius of planet Earth: ");
    radiusOfEarth= input.nextDouble();

    System.out.print("Please enter the mass of the other planet: ");
    massOfOther= input.nextDouble();

    System.out.print("Please enter the radius of the other planet: ");
    radiusOfPlanet= input.nextDouble();

    accel = (g * massOfOther *(radiusOfEarth*radiusOfEarth) )/ (massOfEarth * (radiusOfPlanet*radiusOfPlanet));

    System.out.print("The acceleration due to gravity on the other planet is "+ String.format("%.2f", accel) +"m/s/s");

        System.out.print("The acceleration due to gravity on the other planet is "+ String.format("%.2f", accel) +"m/s/s");



    }
}
