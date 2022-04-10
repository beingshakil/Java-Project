package project;

import java.util.Scanner;
import java.util.ArrayList;

public class School {

    static String encrypt = "shakil";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t***School Management System***");
        System.out.print("\n\t\tEnter Password: ");
        String password = input.nextLine();

        if (encrypt.equals(password)) {
            System.out.println("\n\t\tWhich database you want to access");
            System.out.println("\n1.Student\n2.Teacher");
            System.out.print("Choice: ");
            int choose = input.nextInt();
            if (choose == 1) {
                ArrayList<Student> st = new ArrayList<>();
                while (true) {
                    System.out.println("\n1.Add student\n2.Display all\n3.Search\n4.Update\n5.Delete");
                    System.out.print("Enter choice: ");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("How many student info you want to add: ");
                            int n = input.nextInt();
                            System.out.print("\nEnter the information");
                            for (int i = 0; i < n; i++) {
                                input.nextLine();
                                System.out.println("\n------------------------------");
                                System.out.print("|\t\tName: ");
                                String name = input.nextLine();
                                System.out.println("------------------------------");
                                System.out.print("|\t\tID: ");
                                int id = input.nextInt();
                                input.nextLine();
                                System.out.println("------------------------------");
                                System.out.print("|\t\tAddress: ");
                                String address = input.nextLine();
                                System.out.println("------------------------------");
                                System.out.print("|\t\tGPA: ");
                                double gpa = input.nextDouble();
                                System.out.println("------------------------------");
                                Student obj1 = new Student(name, id, address, gpa);
                                st.add(obj1);
                                if (st.get(i).gpa == 5) {
                                    st.get(i).setGrade("A+");
                                } else if (st.get(i).gpa < 5 && st.get(i).gpa >= 4) {
                                    st.get(i).setGrade("A");
                                } else if (st.get(i).gpa < 4 && st.get(i).gpa >= 3.5) {
                                    st.get(i).setGrade("A-");
                                } else if (st.get(i).gpa < 3.5 && st.get(i).gpa >= 3) {
                                    st.get(i).setGrade("B");
                                } else if (st.get(i).gpa < 3 && st.get(i).gpa >= 2) {
                                    st.get(i).setGrade("C");
                                } else if (st.get(i).gpa < 2 && st.get(i).gpa >= 0) {
                                    st.get(i).setGrade("F");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("------------------------------");
                            System.out.println("\t\tALL STUDENT INFO");
                            System.out.println("------------------------------");
                            for (int i = 0; i < st.size(); i++) {
                                st.get(i).display(i);
                            }
                            break;
                        case 3:
                            int count = 0;
                            input.nextLine();
                            System.out.print("Enter Name to search: ");
                            String search = input.nextLine();
                            for (int i = 0; i < st.size(); i++) {
                                if (st.get(i).name.equalsIgnoreCase(search)) {
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tDATA OF STUDENT " + (i + 1));
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tName: " + st.get(i).name);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tID: " + st.get(i).id);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tAddress: " + st.get(i).address);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tGPA: " + st.get(i).gpa);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tGrade: " + st.get(i).grade);
                                    System.out.println("------------------------------");
                                    count = 1;
                                }
                            }
                            if (count == 0) {
                                System.out.println("------------------------------");
                                System.out.println("|\t\tNot found!!!");
                                System.out.println("------------------------------");
                            }
                            break;

                        case 4:
                            int flag = 0;
                            input.nextLine();
                            System.out.print("\nEnter Name to update: ");
                            String edit = input.nextLine();
                            for (int i = 0; i < st.size(); i++) {
                                if (st.get(i).name.equalsIgnoreCase(edit)) {
                                    System.out.print("Name: ");
                                    String newName = input.nextLine();
                                    st.get(i).setName(newName);
                                    System.out.print("ID: ");
                                    int newId = input.nextInt();
                                    st.get(i).setId(newId);
                                    input.nextLine();
                                    System.out.print("Address: ");
                                    String newAdd = input.nextLine();
                                    st.get(i).setAddress(newAdd);
                                    System.out.print("GPA: ");
                                    double newGpa = input.nextDouble();
                                    st.get(i).setgpa(newGpa);
                                    if (st.get(i).gpa == 5) {
                                        st.get(i).setGrade("A+");
                                    } else if (st.get(i).gpa < 5 && st.get(i).gpa >= 4) {
                                        st.get(i).setGrade("A");
                                    } else if (st.get(i).gpa < 4 && st.get(i).gpa >= 3.5) {
                                        st.get(i).setGrade("A-");
                                    } else if (st.get(i).gpa < 3.5 && st.get(i).gpa >= 3) {
                                        st.get(i).setGrade("B");
                                    } else if (st.get(i).gpa < 3 && st.get(i).gpa >= 2) {
                                        st.get(i).setGrade("C");
                                    } else if (st.get(i).gpa < 2 && st.get(i).gpa >= 0) {
                                        st.get(i).setGrade("F");
                                    }
                                    flag = 1;
                                }
                            }
                            if (flag == 0) {
                                System.out.println("------------------------------");
                                System.out.println("|\t\tNot found!!!");
                                System.out.println("------------------------------");
                            }
                            break;

                        case 5:
                            int num = 0;
                            input.nextLine();
                            System.out.print("\nEnter Name to delete: ");
                            String del = input.nextLine();
                            for (int i = 0; i < st.size(); i++) {
                                if (st.get(i).name.equals(del)) {
                                    st.remove(i);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t  Successfully deleted");
                                    System.out.println("------------------------------");
                                    num = 1;
                                }
                            }
                            if (num == 0) {
                                System.out.println("------------------------------");
                                System.out.println("|\t\tNot found!!!");
                                System.out.println("------------------------------");
                            }
                            break;
                    }
                }
            }
            if (choose == 2) {
                ArrayList<Teacher> teach = new ArrayList<>();
                while (true) {
                    System.out.println("\n1.Add teacher\n2.Display all\n3.Search\n4.Update\n5.Delete");
                    System.out.print("Enter choice: ");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("How many teacher info you want to add: ");
                            int n = input.nextInt();
                            System.out.println("Enter the information");
                            for (int i = 0; i < n; i++) {
                                input.nextLine();
                                System.out.println("------------------------------");
                                System.out.print("|\t\tName: ");
                                String name = input.nextLine();
                                System.out.println("------------------------------");
                                System.out.print("|\t\tID: ");
                                int id = input.nextInt();
                                System.out.println("------------------------------");
                                input.nextLine();
                                System.out.print("|\t\tCourse: ");
                                String course = input.nextLine();
                                System.out.println("------------------------------");
                                System.out.print("|\t\tSalary: ");
                                double salary = input.nextDouble();
                                System.out.println("------------------------------");
                                Teacher obj2 = new Teacher(name, id, course, salary);
                                teach.add(obj2);
                            }
                            break;

                        case 2:
                            System.out.println("\nALL TEACHER INFO");
                            for (int i = 0; i < teach.size(); i++) {
                                teach.get(i).display(i);
                            }
                            break;

                        case 3:

                            input.nextLine();
                            System.out.print("\nEnter Name to Search: ");
                            String search = input.nextLine();
                            int count = 0;
                            for (int i = 0; i < teach.size(); i++) {
                                if (teach.get(i).name.equalsIgnoreCase(search)) {
                                    System.out.println("------------------------------");
                                    System.out.println("\t\tDATA OF TEACHER No." +(i + 1));
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tName: " +teach.get(i).name);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tID: " +teach.get(i).id);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tCourse: " +teach.get(i).course);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t\tSalary: " +teach.get(i).salary);
                                    System.out.println("------------------------------");
                                    count = 1;
                                }
                            }
                            if (count == 0) {
                                System.out.println("------------------------------");
                                System.out.println("|\t\tNot found!!!");
                                System.out.println("------------------------------");
                            }
                            break;

                        case 4:
                            input.nextLine();
                            System.out.print("\nEnter Name to update: ");
                            String edit = input.nextLine();
                            int flag = 0;
                            for (int i = 0; i < teach.size(); i++) {
                                if (teach.get(i).name.equalsIgnoreCase(edit)) {
                                    System.out.print("Name: ");
                                    String newName = input.nextLine();
                                    teach.get(i).setName(newName);
                                    System.out.print("ID: ");
                                    int newId = input.nextInt();
                                    teach.get(i).setId(newId);
                                    input.nextLine();
                                    System.out.print("Course: ");
                                    String newCour = input.nextLine();
                                    teach.get(i).setCourse(newCour);
                                    System.out.print("Salary: ");
                                    double newSalary = input.nextDouble();
                                    teach.get(i).setSalary(newSalary);
                                    flag = 1;
                                }
                            }
                            if (flag == 0) {
                                System.out.println("------------------------------");
                                System.out.println("|\t\tNot found!!!");
                                System.out.println("------------------------------");
                            }
                            break;

                        case 5:
                            input.nextLine();
                            System.out.print("\nEnter Name to Delete: ");
                            String del = input.nextLine();
                            int num = 0;
                            for (int i = 0; i < teach.size(); i++) {
                                if (teach.get(i).name.equals(del)) {
                                    teach.remove(i);
                                    System.out.println("------------------------------");
                                    System.out.println("|\t  Successfully deleted");
                                    System.out.println("------------------------------");
                                    num = 1;
                                }
                            }
                            if (num == 0) {
                                System.out.println("------------------------------");
                                System.out.println("|\t\tNot found!!!");
                                System.out.println("------------------------------");
                            }
                            break;
                    }
                }
            }
        } else {
            System.out.println("PASSWORD IS INCORRECT");
        }
    }
}
