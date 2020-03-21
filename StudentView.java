/*This is the View which displays the Student details*/
package com.mvc;

public class StudentView {

	public StudentView() {
		// TODO Auto-generated constructor stub
	}
	

    public void printStudentDetails(String studentName, String studentRollNo) 
    { 
        System.out.println("Student: "); 
        System.out.println("Name: " + studentName); 
        System.out.println("Roll No: " + studentRollNo); 
    } 

}
