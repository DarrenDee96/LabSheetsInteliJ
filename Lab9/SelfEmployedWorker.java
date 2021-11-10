package Lab9;

public final class SelfEmployedWorker extends Employee {

    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome();
    }

    @Override
    public String toString() {


        return "Self-employed workers name is " + super.toString();
    }

    public void setEstimatedIncome() {
       this.estimatedIncome = (int)(Math.random()*(900 - 400 + 1) + 400);
    }

    @Override
    public double earnings() {
        return estimatedIncome;
    }

}
