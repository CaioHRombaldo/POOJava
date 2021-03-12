/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

/**
 *
 * @author CaioHRombaldo
 */
// Here we create an "implementation inheritance" relationship, 
// it just instantiates the abstract mother class.
public class Visitor extends People {
    
    // Visitor special methods:
    public Visitor(String name, int age, String gender) {
        super(name, age, gender);
    }
    
}
