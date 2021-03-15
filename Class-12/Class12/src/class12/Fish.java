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

    private String scaleColor;
    
    
    public void bubble(){
        System.out.println("Bubble!");
    }
    
    
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
    
}
