/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author CaioHRombaldo
 */
public interface Controller {
    
    // Here we declare all the interface methods of our class in an abstract way.
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void raiseVolume();
    public abstract void lowerVolume();
    public abstract void muteOn();
    public abstract void muteOff();
    public abstract void play();
    public abstract void pause();
    
}
