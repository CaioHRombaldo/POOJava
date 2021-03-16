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
public class Mammal extends Animal {

    //Mammal attributes:
    private String hairColor;
    
    
    // Mammal Override methods:
    @Override
    void move() {
        System.out.println("Running!");
    }

    @Override
    void toFeed() {
        System.out.println("Suckling");
    }

    @Override
    void sound() {
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
