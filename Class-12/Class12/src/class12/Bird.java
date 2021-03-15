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

    private String featherColor;
    
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
    
    public void makeNest(){
        System.out.println("Built a nest!");
    }
    
    
}
