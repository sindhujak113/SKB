/*This is the Model which holds the Student object*/

package com.mvc;

public class Student 
{

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	private String rollNo; 
    private String name; 
     
    public String getRollNo()  
    { 
        return rollNo; 
    } 
     
    public void setRollNo(String rollNo)  
    { 
        this.rollNo = rollNo; 
    } 
     
    public String getName()  
    { 
        return name; 
    } 
     
    public void setName(String name)  
    { 
        this.name = name; 
    } 

}
