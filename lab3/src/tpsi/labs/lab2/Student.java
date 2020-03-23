/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab2;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private String groupId;
    private List<Double>grades= new ArrayList<>();
    double suma=0.0;
    double dzielnik=0;
    
    public List<Double> getGrades(){
        return grades;
    }
    
   
    
    public void addGrade(double grade){
        grades.add(grade);
    }
    
    public Double getGradesAverage(){
    for(Double sredniaOcen : grades){
       suma=sredniaOcen+suma;
       dzielnik++;
    }
    suma=suma/dzielnik;
    return suma;
    }
    
public Student(String firstName, String lastName,String emailAddress, String groupId){
    super(firstName, lastName, emailAddress);
    this.groupId=groupId;
}

public String getGroupId(){
    return groupId;
}

public void setGroupId(String groupId){
    this.groupId=groupId;
}


}
