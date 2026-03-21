package com.pdhai.management_student_course;

public abstract class Course implements Printable{
    protected String courseId;
    protected String courseName;
    protected int credits; // số tín chỉ

    public Course(String id, String name, int credits){
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
    }

    // Setters and Getters
    public String getId(){ return courseId;}
    public void setId(String Id){ this.courseId =Id;}

    public String getName(){ return courseName;}
    public void setName(String name) { this.courseName= name;}

    public int getCredits(){return credits; }
    public void setCredits(int credits){ this.credits = credits; }

    public void displayCourseInfo(){
        System.out.println("Course ID: " + courseId + ", Course Name: " + courseName + ", Credits: " + credits);
    }

    @Override
    public void printDetails(){
        displayCourseInfo();
    }
}
