package Lab7.exercise3;

public class Student {
    private int id;
    private String name;
    private String department;

    public Student(int id , String name, String department) {

    }
    public String toString(){
        return "";
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
}
