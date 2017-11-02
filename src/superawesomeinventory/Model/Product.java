package superawesomeinventory.Model;

import java.util.ArrayList;

public class Product {
    //variable to hold the array of Part objects
    public ArrayList<Part> associatedParts;

    //private so that they can only be accessed outside this class by getters and setters
    private int productID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;

//    public void addAssociatedPart(part){
//        
//    }
    
//    public boolean removeAssociatedPart(int){
//       
//    }
    
//    public Part lookupAssociatedPat(int){
//        
//    }
    
    //getters and setters for the instance variables
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
