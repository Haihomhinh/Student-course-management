package com.pdhai.management_student_course;

public class Course {
    private String courseId;
    private String courseName;
    private int credits; // số tín chỉ

    public Course(String id, String name, int credits){
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
    }

    // Setters and Getters
    String getId(){ return courseId;}
    void setId(String Id){ this.courseId =Id;}

    String getName(){ return courseName;}
    void setName(String name) { this.courseName= name;}

    int getCredits(){return credits; }
    void setCredits(int credits){ this.credits = credits; }

    public void displayCourseInfo(){
        System.out.println("Course ID: " + courseId + ", Course Name: " + courseName + ", Credits: " + credits);
    }

    
}
