
package tpsi.labs.lab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.io.*;




public class Person implements EmailRecipient{

private String emailAddress;
private String firstName;
private String lastName;

public String getEmailAddress(){
    return emailAddress;
}


public Person(String firstName, String lastName, String emailAddress){
    this.firstName=firstName;
    this.lastName=lastName;
    this.emailAddress=emailAddress;
}



public String getFirstName(){
    return firstName;
}

public String getLastName(){
    return lastName;
}

public void setFirstName(String firstName){
    this.firstName=firstName;
}

public void setLastName(String lastName){
    this.lastName=lastName;
}



@Override
public String toString(){
    return firstName + " " + lastName + " " + emailAddress;
}



    public static void main(String[] args) {
        
        Set<String> zbiorDni = new HashSet<>();
        
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("sroda");
        zbiorDni.add("czwartek");
        zbiorDni.add("piatek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");
        
       // System.out.println(zbiorDni);
        Person p1 = new Person("Bill", "Gates","mam");
        Person p2 = new Person("Gal", "Anonim","");
        Teacher nauczycielInformatyki= new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");
        Teacher nauczycielElektroniki = new Teacher("Marek", "Lewandowski", "marek.org", "Introduction to Java");
        Teacher nauczycielProgramowaniaObiektowego = new Teacher("Stanisław", "kariow", "kariow.org", "Programowanie obiektowe");
       // System.out.println(nauczycielInformatyki.getCourseName());
        
       University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
       University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");
       
       Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
       Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
       Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");
       Faculty WI= new Faculty("Wydział do zadania4", "zad4@faculty.ecu.pl");
       
       EmailRecipient[] spamlist = new EmailRecipient[6];
       spamlist[0]=zut;
       spamlist[1]=wsks;
       spamlist[2]=s1;
       spamlist[3]=s2;
       spamlist[4]=t1;
       spamlist[5]=WI;
       //
       for(EmailRecipient recipient : spamlist){
           String email=recipient.getEmailAddress();
     //      System.out.println(email);
       }
      
       Student Patryk= new Student("Patryk", "Kubicki", "jkowalski@wi.zut.edu.pl", "32A");
       
       Patryk.addGrade(4.5);
       Patryk.addGrade(3.5);
       Patryk.addGrade(3);
       Patryk.addGrade(4.5);
       
     // System.out.println(Patryk.getGrades());
    //  System.out.println(Patryk.getGradesAverage());
      
      zut.addFaculty(WI);
     
     // System.out.println(zut.getFaculities());
      
     WI.addTeacher(nauczycielInformatyki);
     WI.addTeacher(nauczycielElektroniki);
     //WI.addTeacher(nauczycielProgramowaniaObiektowego);
	 
     //System.out.println(WI.getTeachers());
     
     
     //Zad 1
     Map<String, Teacher> nauczycieleProwadzacy = new HashMap<>();
     nauczycieleProwadzacy.put("Introduction to C++", nauczycielInformatyki);
     nauczycieleProwadzacy.put("Introduction to Java", nauczycielElektroniki);
     nauczycieleProwadzacy.put("Programowanie obiektowe", nauczycielProgramowaniaObiektowego);
     
     Teacher prowadzacyPO = nauczycieleProwadzacy.get("Programowanie obiektowe");
     
     
     System.out.println(prowadzacyPO.getFirstName() + " " +prowadzacyPO.getLastName());
    //System.out.println(prowadzacyPO.getFullName());
    
    
    
    // Zad 2
    Map<Integer, List<Student>> grupy = new HashMap<>();
    
    List<Student> grupa32 = new ArrayList<>();
    grupa32.add(new Student("Marko", "Polo", "plo@wi.zut.edu.pl", "32"));
    grupa32.add(new Student("Patryk", "Kubacki", "patriques@wi.zut.edu.pl", "32"));
    
    List<Student> grupa33 = new ArrayList<>();
     grupa33.add(new Student("Miłosz", "kramaski", "milosz@wi.zut.edu.pl", "33"));
     grupa33.add(new Student("wojtek", "Gola", "gloo@wi.zut.edu.pl", "33"));
    grupy.put(32, grupa32);
    grupy.put(33, grupa33);
    
    List<Student> danaGrupa = grupy.get(32);
    for(int i=0; i<danaGrupa.size( ); i++){
        Student pierwszy = danaGrupa.get(i);
        System.out.println(pierwszy.toString());
        
    }
    
    //Zad3
    
    try(BufferedReader in = new BufferedReader(new FileReader("plik.txt"))) {
    Map<Double,Product> productIDMap = new HashMap<>();
    
    Map<String, List<Product>> productCategoryMap = new HashMap<>();
    List<Product> listaProduktow = new ArrayList<>();
    
    List<Product> slodycze = new ArrayList<>();
    List<Product> narzedzia = new ArrayList<>();
    List<Product> oprogramowanie = new ArrayList<>();
    List<Product> inne = new ArrayList<>();
    List<Product> nowaKategoria = new ArrayList<>();
   
   
    
   //zrobic listy dla kazdej kategorii potem switcha i dodawac produkty osobno; 
    
    String przykladKategori="";
    Set<String> listaKategori = new HashSet<>();
    String s = in.readLine();
    System.out.println();
    while(s!=null) {
           
        System.out.println(s);
        String[] pola = s.split(";");
        double d = Double.parseDouble(pola[0]);
        double d2 = Double.parseDouble(pola[3]);     
        Product Produkt = new Product(d, pola[1], pola[2], d2);
        listaKategori.add(pola[2]);
        listaProduktow.add(Produkt);
       
        productIDMap.put(d,Produkt);
        
        switch(pola[2]){
            case "słodycze":
                slodycze.add(Produkt);
                break;
                
            case "narzędzia":
                narzedzia.add(Produkt);
                break;
            
            case "oprogramowanie":
                oprogramowanie.add(Produkt);
                break;
                
            case "inne":
                inne.add(Produkt);
                break;              
            default:
                nowaKategoria.add(Produkt);
                przykladKategori=pola[2];
        }
        
       
        s = in.readLine();
        
    }
    
    
    System.out.println();
    productCategoryMap.put("słodycze",slodycze);
    productCategoryMap.put("narzędzia",narzedzia);
    productCategoryMap.put("oprogramowanie",oprogramowanie);
    productCategoryMap.put("inne",inne);
    productCategoryMap.put("przykladKategori",nowaKategoria);
    

   
    
    for(int i=0; i<listaProduktow.size();i++){
        Product poczatek = listaProduktow.get(i);
    //    System.out.println(poczatek.getProduct());
        
    }
    
    List<Product> test = productCategoryMap.get("oprogramowanie");
    
    for(int i=0; i<test.size();i++){
        Product poczatek = test.get(i);
       
        System.out.println(poczatek.getProduct());
   
    }
    
    
    
    
    Product poID = productIDMap.get(109.0);
  //  System.out.println(poID.getProduct());
     

  
  
  
} catch (IOException ex) {
    ex.printStackTrace();
}
    
    
   
     
    
    
    
    }
}