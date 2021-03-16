/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

/**
 *
 * @author CaioHRombaldo
 */
public class Wolf extends Mammal {
    
    // Wolf Override methods:
    @Override
    public void makeSound(){
        System.out.println("Auuuuuuuuuuu!");
    }
    
    
    // Wolf Special methods:
    public Wolf(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }
    
}
