package project;
 
public class Teacher {
    public String name;
    public int id;
    public String course;
    public double salary;
 
    public Teacher(String name, int id, String course, double salary) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.salary = salary;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public void setCourse(String course) {
        this.course = course;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public void display(int i){
        System.out.println("------------------------------");
        System.out.println("|\t\tTeacher no."+(i+1));
        System.out.println("------------------------------");
        System.out.println("|\t\tName: " + name);
        System.out.println("------------------------------");
        System.out.println("|\t\tID: " + id);
        System.out.println("------------------------------");
        System.out.println("|\t\tCourse: " +course);
        System.out.println("------------------------------");
        System.out.println("|\t\tSalary: " +salary);
        System.out.println("------------------------------");
    }
}
