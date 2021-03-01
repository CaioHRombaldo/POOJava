/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author CaioHRombaldo
 */
public class Pen {
    //Class attributes
    String model;
    String color;
    float tip;
    int charge;
    boolean capped;
    
    //Class methods
    void scribble(){
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
    
    void cap(){
        // Checks if the pen is capped
        if(this.capped){
            // If it is:
            System.out.println("ERROR this is already capped!");
        }else{
            // If no:
            this.capped = true;
        }
    }
    
    void uncap(){
        // Checks if the pen is capped
        if(this.capped){
            // If it is:
            this.capped = false;
        }else{
            // If no:
            System.out.println("ERROR this is already uncapped!");
        }
    }
    
    void status(){
        // status method prints: 
        System.out.println("Model: " + this.model);
        System.out.println("A " + this.color + " Pen");
        System.out.println("Tip size: " + this.tip);
        System.out.println("Charge: " + this.charge);
        System.out.println("Is the pen capped? " + this.capped);
    }
    
}
