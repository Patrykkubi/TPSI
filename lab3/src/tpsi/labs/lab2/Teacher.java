/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab2;


public class Teacher extends Person{
    
private String courseName;
private String FullTeacherName;

public Teacher(String firstName, String lastName,String emailAddress, String courseName){
    super(firstName, lastName, emailAddress);
    this.courseName=courseName;
    this.FullTeacherName= firstName + " " + lastName + " " + emailAddress + " " + courseName;
}

public String getFullName(){
    return FullTeacherName;
}
public String getCourseName(){
    return courseName; 
   
}

public void setCourseName(String courseName){
    this.courseName=courseName;
}



    
}
