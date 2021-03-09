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
// Here we implement the "Controller" interface, acquiring all its methods.
public class RemoteControl implements Controller {
    
    // Remote Control attributes.
    private int volume;
    private boolean playing;
    private boolean on;
    
    
    // Special methods "Constructor", "Setters" and "Getters".
    public RemoteControl() {
        this.volume = 50;
        this.playing = false;
        this.on = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    private boolean getOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }
    
    
    // Abstract methods.
    // Here, we override all the abstract methods of the controller
    // assigning them a function.
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        // Here we show the object information on the console.
        System.out.println("--------MENU--------");
        System.out.println("It's on? " + this.getOn());
        System.out.println("It's playing? " + this.getPlaying());
        System.out.println("Volume: " + this.getVolume() + "%");
        
        // Here we run a loop to show the volume in bars.
        System.out.print("Vol: [");
        for(int i = 0; i < this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("]");
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing Menu");
    }

    @Override
    public void raiseVolume() {
        // Here we increase the volume only if the tv is on.
        if(this.getOn()){
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("ERROR!! First turn on the TV to increase the volume!");
        }
    }

    @Override
    public void lowerVolume() {
        // Here we decrease the volume only if the tv is on.
        if(this.getOn()){
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("ERROR!! First turn on the TV to decrease the volume!");
        }
    }

    @Override
    public void muteOn() {
        // Here, we mute the TV only if it is on and the volume is greater than 0.
        if(this.getOn() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void muteOff() {
        // Here we unmute the tv only if it is already on and not in mute mode.
        if(this.getOn() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        // Here we can only play if it is on and not playing.
        if(this.getOn() && !(this.getPlaying())){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        // Here we can only pause if it is on and playing.
        if(this.getOn() && this.getPlaying()){
            this.setPlaying(false);
        }
    }
    
    
    
    
    
}
