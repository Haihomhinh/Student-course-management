package com.pdhai.management_student_course;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final String String = null;

    // this funtion to read integer input safely, avoiding the input strings are not integers
    public static int readInt(Scanner scanner){
        while(true){
            String input = scanner.nextLine().trim(); // trim() loại bỏ khoảng trắng thừa
            try{
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e){
                System.out.print("Please enter a number again: ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Student> students= new ArrayList<>();
        ArrayList<Course> courses= new ArrayList<>();

        int choice;
        do {
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Exit");
            System.out.println("4. Enter the Course/Student's ID");
            System.out.print("Enter choice: ");
            choice = readInt(scanner);

            switch(choice){
                case 1: 
                    manageStudents(scanner, students);
                    break;

                case 2: 
                    manageCourses(scanner, courses);
                    break;

                case 3: 
                    findTheID(scanner, String , students, courses);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
        scanner.close();
    }

//================= Methods to manage students and courses ===================
    public static void manageStudents(Scanner scanner, ArrayList<Student> students){
        int choice;
        do {
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Exit.");
            System.out.print("Enter choice: ");
            choice = readInt(scanner); 

            switch(choice)
            {
                case 1: 
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    students.add(new Student(id, name, email));
                    break;
                case 2:
                    if(students.isEmpty()){
                        System.out.println("No one in the list");
                        break;
                    }
                    
                    int STT = 0;
                    System.out.printf("%-5d.", ++STT);
                    for(Student s: students){
                        s.printDetails();;
                    }
                    break;
            }
        } while (choice != 3);
    }

//================= Methods to manage courses ===================
    public static void manageCourses(Scanner scanner, ArrayList<Course> courses){
        int choice_course;
        do {
            System.out.println("1.Add Course.");
            System.out.println("2.Display Courses.");
            System.out.println("3.Exit.");
            System.out.print("Enter choice: ");
            choice_course = readInt(scanner);

            switch( choice_course){
                case 1:
                    System.out.print("Enter Course ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Credits: ");
                    int credits = readInt(scanner);

                    // Sub-menu for course type
                    System.out.println("1.Online course.");
                    System.out.println("2.Offline course.");
                    System.out.print("Enter your choice: ");
                    int type = readInt(scanner);

                    Course course = null; // Implementing course with null value to avoid error

                    if(type == 1){
                        System.out.print("Enter platform: ");
                        String platform = scanner.nextLine().trim();

                        course = new OnlineCourse(id, name, credits, platform);
 
                    }
                    else if(type == 2){
                        System.out.print("Location: ");
                        String location = scanner.nextLine().trim();

                        course = new OfflineCourse(id, name, credits, location);
                    }

                    courses.add(course); // Add the created course to the list

                    System.out.println("Course added successfully.");
                    break;
                
                case 2: 
                    if (courses.isEmpty()){
                        System.out.println("No courses in your list.");
                        break;
                    }
                    int STT = 0;
                    for ( Course c: courses){
                        System.out.printf("%-5d.", ++STT);
                        c.displayCourseInfo();
                    }
                    break;
                
                case 3: 
                    System.out.println("Exiting course management.");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        while(choice_course != 3);
    }

    public static void findTheID(Scanner scanner, String s, ArrayList<Student> students, ArrayList<Course> courses){
    int choice;
        do {
            System.out.println("1.Student");
            System.out.println("2.Course");
            System.out.println("3.Exit.");
            System.out.print("Enter choice: ");
            choice = readInt(scanner); 

            switch(choice)
            {
                case 1: 
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    for(Student student: students){
                        if(student.getId().equals(id)){
                            student.printDetails();
                            return;
                        }
                    }
                    
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    String id1 = scanner.nextLine();
                    boolean found = false;

                    for(Course course : courses){
                        if(course.getId().equals(id1)){
                            found =true;
                            course.printDetails();
                            return;
                        }
                   }

                   if(!found){
                        System.out.println("Can not find the suitable result");
                        return;
                   }
                    break;
            }
        } while (choice != 3);
    }
}
