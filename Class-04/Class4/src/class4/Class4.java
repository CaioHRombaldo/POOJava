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
public class Class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Here we instantiate the p1 Pen Object.
        // Here we also managed to pass some parameters for the constructor method to execute when creating the object.
        Pen p1 = new Pen("BIC","Blue",0.5f);
        
        // As the attribute is model it is public, 
        // using the special method here we will obtain the same result as the direct access.
        // p1.model = "Bic Cristal Up";
        // p1.setModel("BIC Cristal UP");
        
        // But here, as the tip attribute is private
        // we can only modify it using the modifier method.
        // p1.tip = 0.5f;
        // p1.setTip(0.5f);
        
        // Here we call the accessor methods (getters) to print de atributtes on terminal.
        // System.out.println("I have a " + p1.getModel() + " tip " + p1.getTip() + "pen.");
        
        // Here we call status method to print de atributtes on terminal.
        p1.status();
        
        // Now we can create as many pens as we want in an abstract way using the same class:
        
        Pen p2 = new Pen("Student","Black",0.7f);
        Pen p3 = new Pen("Professional","Red",0.5f);
        Pen p4 = new Pen("Special","Green",0.4f);
        
        p2.status();
        p3.status();
        p4.status();
        
    }
    
}
