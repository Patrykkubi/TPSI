/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab2;
import java.util.List;
import java.util.ArrayList;

public class Product {
   private Double id;
   private String name;
   private Double price;
   private String category;
   private String FullProduct;
   private List<Product> produktList = new ArrayList<>();
   
    public Product(Double id, String name, String category,Double price){
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.FullProduct= id +" "+ name+ " " + category + " " + price; 
    }
    
    public String getProduct(){
        return FullProduct;
    }
    
    public List<Product> getProductList(){
        return produktList;
    }
    public String getCategory(){
        return category;
    }
    
 
}
