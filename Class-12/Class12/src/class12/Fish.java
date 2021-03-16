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
public class Fish extends Animal {

    // Fish attributes:
    private String scaleColor;

    
    // Fish custom methods:
    public void bubble(){
        System.out.println("Bubble!");
    }
    
    
    // Fish Override methods:
    @Override
    void move() {
        System.out.println("Swimming!");
    }

    @Override
    void toFeed() {
        System.out.println("Eating Substances!");
    }

    @Override
    void sound() {
        System.out.println("Fish makes no noise!");
    }
    
    
    // Fish special methods:
    public Fish(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    
}
