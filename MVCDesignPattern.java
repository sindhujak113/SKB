package com.mvc;

public class MVCDesignPattern 
{

	public static void main(String[] args)  
    { 
        Student model  = fetchStudentFromDatabase(); 
  
        StudentView view = new StudentView(); 
  
        StudentController controller = new StudentController(model, view); 
  
        controller.updateView(); 
  
        controller.setStudentName("Vikas Gupta"); 
  
        controller.updateView(); 
    } 
  
    private static Student fetchStudentFromDatabase() 
    { 
        Student student = new Student(); 
        student.setName("Anubhav Singh"); 
        student.setRollNo("01631A00511"); 
        return student; 
    } 

}
