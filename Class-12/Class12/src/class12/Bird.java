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
public class Bird extends Animal {

    // Bird attributes:
    private String featherColor;

    // Bird custom methods:
    public void makeNest(){
        System.out.println("Built a nest!");
    }
    
    // Bird Override methods:
    @Override
    void move() {
        System.out.println("Flying!");
    }

    @Override
    void toFeed() {
        System.out.println("Eating Fruits!");
    }

    @Override
    void sound() {
        System.out.println("Bird Sound!");
    }
    
    
    // Bird special methods:
    public Bird(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    
}
