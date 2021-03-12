/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10;

/**
 *
 * @author CaioHRombaldo
 */
// Here we define our class as a daughter of "People", 
// so she will receive her attributes and methods.
public class Teacher extends People {
    
    // Teacher attributes:
    private String specialty;
    private float remuneration;
    
    
    // Teacher custom methods:
    public void receiveIncrease(float amount){
        this.setRemuneration(this.getRemuneration() + amount);
    }
    
    
    // Teacher special methods:
    public Teacher(String name, int age, String gender, String specialty, float remuneration) {
        // The "super" line refers to the code we received from the mother class.
        super(name, age, gender);
        // Here we can add new features to the builder we received from "People".
        this.specialty = specialty;
        this.remuneration = remuneration;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(float remuneration) {
        this.remuneration = remuneration;
    }
    
}
