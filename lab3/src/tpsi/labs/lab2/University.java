/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Patryk
 */
public class University implements EmailRecipient {
 
    private String emailAddress;
    private String name;
    private List<Faculty> faculties=new ArrayList<>();
    
    public List<Faculty> getFaculities(){
        return faculties;
    }    
    
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    
    public University(String name,String emailAddress){
        this.emailAddress=emailAddress;
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    @Override
    public String getEmailAddress(){
        return emailAddress;
    }
}
