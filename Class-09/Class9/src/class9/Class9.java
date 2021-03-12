/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author CaioHRombaldo
 */
public class Class9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Here we can test our code to check if your classes are working.
        // First, let's create our people and our books:
        People[] p = new People[2];
        Book[] b = new Book[3];
        
        p[0] = new People("Eduardo", 21, "M");
        p[1] = new People("Mônica", 23, "F");
        
        b[0] = new Book("Learning OOP", "Júlio Cesar", 450, p[0]);
        b[1] = new Book("Advanced Java", "Renata Marques", 500, p[1]);
        b[2] = new Book("Meditation for programmers", "Kátia Aquiles", 300, p[0]);
        
        //b[0].open();
        //b[0].flipThrough(600);
        //b[0].nextPage();
        //b[0].backPage();
        
        //System.out.println(b[0].details());
        //System.out.println(b[1].details());
        //System.out.println(b[2].details());
    }
    
}
