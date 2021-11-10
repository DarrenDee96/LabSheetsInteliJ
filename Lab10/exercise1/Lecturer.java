package Lab10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String coursesTaught[];
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    @Override
    public String toString() {
        String str = "";

        str += "Lecturer name: " + getName() + "\nAddress: " + getAddress() + "\nDate of Birth: ";

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        if(getDateOfBirth()!=null) {
            Date dob = getDateOfBirth().getTime();

            String strDob = formatDate.format(dob);
            str += strDob;
        }
        else{
            str += "Undefined";
        }

        str+= "\nStaffID: " + getStaffID() + "\nCourse Taught: " + Arrays.toString(getCoursesTaught()) ;



        str+= "\nDate Of Appointment: " + formatDate.format(getDateOfAppointment().getTime()) + "\nLecturer Status is " + getStatus() +
        "\nLecturer point on scale is " + getPointOnScale();
        return str;

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public abstract String getStatus();


    public abstract int getPointOnScale();


}
