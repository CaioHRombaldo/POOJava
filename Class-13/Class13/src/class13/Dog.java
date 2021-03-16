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
public class Dog extends Wolf {
    
    // Dog Overload methods:
    // React to a phrase.
    public void reaction(String phrase){
        if (phrase.equals("Take food") || phrase.equals("Hello")) {
            System.out.println("Shake and Bark!");
        } else {
            System.out.println("Growl!");
        }
    }
    
    // React according to the time of day.
    public void reaction(float time){
        if (time < 12.00) {
            System.out.println("Shake!"); 
        } else if (time < 18.00) {
            System.out.println("Shake and Bark!");
        } else {
            System.out.println("Ignore!");
        }
    }
    
    // React whether you own it or not.
    public void reaction(boolean owner){
        if (owner) {
            System.out.println("Shake!");
        } else {
            System.out.println("Growl and Bark!");
        }
    }
    
    // React according to age and weight.
    public void reaction(int age, float weight){
        if (age < 5) {
            if (weight < 10) {
                System.out.println("Shake!");
            } else {
                System.out.println("Bark!");
            }
        } else {
            if (weight < 10) {
                System.out.println("Growl!");
            } else {
                System.out.println("Ignore!");
            }
        }
    }
    
    
    // Dog Override methods:
    @Override
    public void makeSound(){
        System.out.println("Au! Au! Au!");
    }
    
    
    // Dog special methods:
    public Dog(float weight, int age, int limbs) {
        super(weight, age, limbs);
    }
    
}
