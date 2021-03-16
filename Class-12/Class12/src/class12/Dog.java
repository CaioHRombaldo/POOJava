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
public class Dog extends Mammal {
    
    // Dog custom methods:
    public void buryBone(){
        System.out.println("Burying Bone!");
    }
    
    public void wagTail(){
        System.out.println("Wagging Tail!");
    }
    
    // Dog special methods:
    public Dog(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }
    
}
