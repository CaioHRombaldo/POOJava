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
public class Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // New instance of the new object of the class "Pen".
        // This creates the p1 Pen Object.
        Pen p1 = new Pen();
        
        // Here we can access and modify its attributes:
        p1.color = "Blue";
        p1.tip = 0.5f;
        p1.charge = 90;
        
        // Here we call a method to change an attribute.
        p1.cap();
        
        // Here we execute the object's status method.
        p1.status();
        
        // Here we try to scribble, but the pen is capped and accuses error.
        p1.scribble();
        
        // Here we uncap the pen and try to scribble again.
        p1.uncap();
        p1.scribble();
        
        // New instance of the new object of the class "Pen".
        // This creates the p2 Pen Object. (That will not affect the p1)
        Pen p2 = new Pen();
        
        // Here we can access and modify its attributes:
        p2.model = "Student";
        p2.color = "Black";
        p2.tip = 0.7f;
        p2.charge = 50;
        
        // Here we execute the object's status method.
        p2.status();
        
        // Here we try to scribble:
        p2.scribble();
        
        
    }
    
}
