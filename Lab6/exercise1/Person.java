package Lab6.exercise1;

public class Person {
    private String firstName;
    private String lastName;

    //No arg
    public Person() {
        firstName = "Not Supplied";
        lastName = "Not Supplied";
    }


    //multi arg
    public  Person (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
    }


    //toString
    public String toString() {
        return "Values of the person object is: First name: " + firstName + "  Last name: " + lastName;
    }


    //setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //getter
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
