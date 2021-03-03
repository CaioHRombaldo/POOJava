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
    private float tip;
    
    // Here we define our special methods "setters" and "getters" 
    // that will return or modify the attributes of the Class.
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String penModel){
        this.model = penModel;
    }
    
    public float getTip(){
        return this.tip;
    }
    
    public void setTip(float penTip){
        this.tip = penTip;
    }
    
    // Here we pass the getters methods internally to the status method.
    public void status(){
        System.out.println("About the pen:");
        System.out.println("Model: " + this.getModel());
        System.out.println("Tip: " + this.getTip());
    }
    
}
