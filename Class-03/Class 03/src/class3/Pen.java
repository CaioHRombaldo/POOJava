/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author CaioHRombaldo
 */
public class Pen {
    //Class attributes
    public String model;
    public String color;
    private float tip;
    protected int charge;
    private boolean capped;
    
    //Class methods
    public void write(){
        
    }
    
    public void scribble(){
        // Checks if the pen is capped
        // Because if it is, we can't scribble until we uncap it
        if(this.capped){
            // If it is:
            System.out.println("ERROR the pen is capped!");
        }else{
            // If no execute this:
            System.out.println("I'm scribble");   
        }
        
    }
    
    public void paint(){
        
    }
    
    public void cap(){
        // Checks if the pen is capped
        if(this.capped){
            // If it is:
            System.out.println("ERROR this is already capped!");
        }else{
            // If no:
            this.capped = true;
        }
    }
    
    public void uncap(){
        // Checks if the pen is capped
        if(this.capped){
            // If it is:
            this.capped = false;
        }else{
            // If no:
            System.out.println("ERROR this is already uncapped!");
        }
    }
    
    public void status(){
        // status method prints: 
        System.out.println("Model: " + this.model);
        System.out.println("A " + this.color + " Pen");
        System.out.println("Tip size: " + this.tip);
        System.out.println("Charge: " + this.charge);
        System.out.println("Is the pen capped? " + this.capped);
    }
    
}
