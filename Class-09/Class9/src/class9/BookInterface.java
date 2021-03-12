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
public interface BookInterface {
    
    // Here we declare all the interface methods of our class in an abstract way.
    public abstract void open();
    public abstract void close();
    public abstract void flipThrough(int until);
    public abstract void nextPage();
    public abstract void backPage();
    
}
