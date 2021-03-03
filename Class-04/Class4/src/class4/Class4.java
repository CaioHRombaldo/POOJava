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
        Pen p1 = new Pen();
        
        // As the attribute is model it is public, 
        // using the special method here we will obtain the same result as the direct access.
        // p1.model = "Bic Cristal Up";
        p1.setModel("BIC Cristal UP");
        
        // But here, as the tip attribute is private
        // we can only modify it using the modifier method.
        // p1.tip = 0.5f;
        p1.setTip(0.5f);
        
        // Here we call the accessor methods (getters) to print de atributtes on terminal.
        System.out.println("I have a " + p1.getModel() + " tip " + p1.getTip() + "pen.");
        
        // Here we call status method to print de atributtes on terminal.
        p1.status();
        
    }
    
}
