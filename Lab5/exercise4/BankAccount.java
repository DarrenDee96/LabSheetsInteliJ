package Lab5.exercise4;

public class BankAccount {

    private String owner;
    private int number;
    private static double interestRate;

    //No argument
    public BankAccount() {
        owner = "Owner Not Available";
        number = 0;
        interestRate =0;
    }


    //Multi argument
    public BankAccount(String owner, int number, double interestRate) {

    }


    //Getters
    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public static double getInterestRate(){
        return interestRate;
    }

    //Setters
    public void setOwner() {

    }

    public void setNumber() {

    }
    public static void setInterestRate() {

    }

    public String toString() {

        return "";
    }

}
