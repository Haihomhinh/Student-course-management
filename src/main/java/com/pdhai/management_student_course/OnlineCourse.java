package com.pdhai.management_student_course;

public class OnlineCourse extends Course{
    private String platform;

    public OnlineCourse(String id, String name, int credits, String platform){
        super(id,name,credits);
        this.platform = platform;
    }

    @Override
    public void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Platform: "+platform);
    }   

    @Override
    public void printDetails(){
        displayCourseInfo();
    }
}
