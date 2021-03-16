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
public abstract class Animal {
    
    // Animal attributes:
    protected float weight;
    protected int age;
    protected int limbs;
    
    
    // Animal custom methods:
    public abstract void makeSound();
    
    
    // Animal special methods:
    public Animal(float weight, int age, int limbs) {
        this.weight = weight;
        this.age = age;
        this.limbs = limbs;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
    
}
