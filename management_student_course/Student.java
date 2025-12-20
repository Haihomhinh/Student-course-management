package com.pdhai.management_student_course;

public class Student {
    private String studentId;
    private String studentName;
    private String studentEmail;

    public Student(String id, String name, String email){
        this.studentId =id;
        this.studentName = name;
        this.studentEmail = email;  
    }

    //Setters and Getters
    public String getId(){  return studentId;  }
    public void setIDd(String id){ this.studentId = id;  }

    public String getName(){ return studentName;}
    public void setName(String name){ this.studentName = name;}
       
    public String getEmail(){ return studentEmail;}
    public void setEmail(String email){ this.studentEmail = email;}
    
    public void displayStudentInfo(){
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", Email: " + studentEmail);
    }
}
