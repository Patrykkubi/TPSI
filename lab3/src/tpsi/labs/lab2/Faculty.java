/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements EmailRecipient{
    String facultyName;
    String emailAddress;
    private List<Teacher> teachers= new ArrayList<>();
    
    public Faculty(String facultyName,String emailAddress){
        this.emailAddress=emailAddress;
        this.facultyName=facultyName;
    }
    
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    
    public List<Teacher> getTeachers(){
        return teachers;
    }
    
    @Override
    public String getEmailAddress(){
        return emailAddress;
    }
}
