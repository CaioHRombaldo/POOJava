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
public class Reptile extends Animal {
    
    // Reptile attributes:
    private String scaleColor;

    
    // Reptile Override methods: 
    @Override
    void move() {
        System.out.println("Crawling!");
    }

    @Override
    void toFeed() {
        System.out.println("Eating Vegetables!");
    }

    @Override
    void sound() {
        System.out.println("Reptile Sound!");
    }
    
    
    // Reptile special methods:
    public Reptile(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    
}
