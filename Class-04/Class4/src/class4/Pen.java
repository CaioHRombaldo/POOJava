/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

/**
 *
 * @author CaioHRombaldo
 */
public class Pen {
    
    public String model;
    private String color;
    private float tip;
    private boolean capped;
    
    // This is the constructor method, it is executed once in the creation of the object.
    // In java it is created with the name of the class itself.
    public Pen(String penModel, String penColor, float penTip){
        this.setModel(penModel);
        this.setColor(penColor);
        this.setTip(penTip);
        this.cap();
    }
    
    // Here we define our special methods "setters" and "getters" 
    // that will return or modify the attributes of the Class.
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String penModel){
        this.model = penModel;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String penColor){
        this.color = penColor;
    }
    
    public float getTip(){
        return this.tip;
    }
    
    public void setTip(float penTip){
        this.tip = penTip;
    }
    
    public boolean getCapped(){
        return this.capped;
    }
    
    public void cap(){
        this.capped = true;
    }
    
    public void uncap(){
        this.capped = false;
    }
    
    // Here we pass the getters methods internally to the status method.
    public void status(){
        System.out.println("---------------------------");
        System.out.println("About the pen:");
        System.out.println("Model: " + this.getModel());
        System.out.println("Color: " + this.getColor());
        System.out.println("Tip: " + this.getTip());
        System.out.println("Capped: " + this.getCapped());
    }
    
}
