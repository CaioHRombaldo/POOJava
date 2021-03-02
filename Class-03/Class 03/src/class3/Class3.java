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
public class Class3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // New instance of the new object of the class "Pen".
        // This creates the p1 Pen Object.
        Pen p1 = new Pen();
        
        // Here we try to change the p1 attributes:
        p1.model = "BIC Cristal Up";
        p1.color = "Blue";
        
        // Here we have an error when trying to modify the attribute in the main class
        // Because the attribute is private.
        //p1.tip = 0.5f;
        //p1.capped = false;
        
        // Here even being protected we can modify the attributes without error 
        // Because the class is instantiated in our main method.
        p1.charge = 75;
        
        
        // Here we execute the object's status method.
        p1.status();
        
        // Here we use the "cap" and "uncap" methods to change the "private capped" atributte.
        // cap and uncap methods are public, but capped bool does not.
        p1.cap();
        p1.uncap();
        
        p1.scribble();
    }
    
}
