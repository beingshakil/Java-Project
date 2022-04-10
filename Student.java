package project;
 
public class Student {
    public String name;
    public int id;
    public String address;
    public double gpa;
    public String grade;
 
    public Student(String name, int id, String address, double gpa) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public void setgpa(double gpa) {
        this.gpa = gpa;
    }
 
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void display(int i){
        System.out.println("------------------------------");
        System.out.println("|\t\tStudent no."+(i+1));
        System.out.println("------------------------------");
        System.out.println("|\t\tName: " + name);
        System.out.println("------------------------------");
        System.out.println("|\t\tID: " + id);
        System.out.println("------------------------------");
        System.out.println("|\t\tAddress: " +address);
        System.out.println("------------------------------");
        System.out.println("|\t\tGPA: " +gpa);
        System.out.println("------------------------------");
        System.out.println("|\t\tGrade: " +grade);
        System.out.println("------------------------------");
    }
 
}
 