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
public class Mammal extends Animal{

    // Mammal attributes:
    protected String hairColor;
    

    // Mammal Override methods:
    @Override
    public void makeSound() {
        System.out.println("Mammal Sound!");
    }
        
    
    // Mammal special methods:
    public Mammal(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
}
