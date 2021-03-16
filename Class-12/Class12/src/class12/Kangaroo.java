/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

/**
 *
 * @author CaioHRombaldo
 */
public class Kangaroo extends Mammal {
    
    // Kangaroo custom methods:
    public void usePurse(){
        System.out.println("Using Purse!");
    }
    
    
    // Kangaroo Override methods:
    @Override
    void move(){
        System.out.println("Jumping!");
    }
    
    
    // Kangaroo special methods:
    public Kangaroo(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }
    
}
