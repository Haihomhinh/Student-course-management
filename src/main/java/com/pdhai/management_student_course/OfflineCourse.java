package com.pdhai.management_student_course;

public class OfflineCourse extends Course{
    private String location;
    
    public OfflineCourse(String id, String name, int credits, String location){
        super(id,name,credits);
        this.location = location;
    }

    @Override
    public void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Location: "+ location);
    }

    @Override
    public void printDetails(){
        displayCourseInfo();
    }
}
