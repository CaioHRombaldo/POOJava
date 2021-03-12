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
public class Class10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        People p1 = new People("Pedro", 22, "M");
        Student p2 = new Student("Maria", 18, "F", "Computing");
        Teacher p3 = new Teacher("Claudia", 32, "F", "Data processing", 3552.60f);
        Employee p4 = new Employee("Fabiana", 25, "F", "Cleaning");
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        // Purposeful Mistakes:
        // p1.getRegistration();
        // p4.receiveIncrease(30f);
    
    }
    
}
