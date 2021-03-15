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
public abstract class Animal {
    
    // Animal attributes:
    // We define the attributes as protected so that the child classes can have access.
    protected float weight;
    protected int age;
    protected int limbs;
    
    
    // Animal custom methods:
    // Here we define the abstract methods that animal heirs need to implement.
    abstract void move();
    
    abstract void toFeed();
    
    abstract void sound();
    
    
    // Animal special methods:
    
    
}
