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
public class Class6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RemoteControl rC = new RemoteControl();
        // Here we can test our RemoteControl Class using the Controller interface.
        
        rC.turnOn();
        
        //rC.muteOn();
        //rC.muteOff();
        
        //rC.play();
        //rC.pause();
        
        //rC.raiseVolume();
        //rC.raiseVolume();
        
        //rC.lowerVolume();
        //rC.lowerVolume();
        
        rC.openMenu();
        rC.closeMenu();
    }
    
}
