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
public class Turtle extends Reptile {
    
    // Turtle Override methods:
    @Override
    void move(){
        System.out.println("Walking toooo slowly!");
    }
    
    
    // Turtle special methods:
    public Turtle(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }
    
}
