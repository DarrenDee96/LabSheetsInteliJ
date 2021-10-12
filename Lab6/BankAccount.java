package Lab6;

public class BankAccount {

    private String owner;
    private static int number;
    private static double interestRate;

    //No argument
    public BankAccount() {
        owner = "Owner Not Available";
        interestRate =0;
       incrementCount();
    }


    //Multi argument
    public BankAccount(String owner, int number, double interestRate) {
            this.owner = owner;
            incrementCount();
            BankAccount.interestRate = interestRate;
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
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    //toString
    public String toString() {

        return "Owner : " + getOwner() + "  Account Number: "+ getNumber() + "  Interest Rate: "+ BankAccount.interestRate;
    }
    private static void incrementCount(){
        number++;
    }

}
