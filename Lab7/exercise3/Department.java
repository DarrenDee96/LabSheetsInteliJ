package Lab7.exercise3;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name , Student[] students) {

    }

    public String toString() {
        return "Departments:\nName:";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

}
