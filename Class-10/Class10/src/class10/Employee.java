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
public class Employee extends People {
    
    // Employee attributes:
    private String sector; 
    private boolean working;
    
    
    // Employee custom methods:
    public void changeWorking(){
        this.setWorking(!this.getWorking());
    }
    
    
    // Employee special methods:
    public Employee(String name, int age, String gender, String sector) {
        // The "super" line refers to the code we received from the mother class.
        super(name, age, gender);
        // Here we can add new features to the builder we received from "People".
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean getWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    
}
