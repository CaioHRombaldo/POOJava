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
public class RemoteControl {
    
    // Remote Control attributes.
    private int volume;
    private boolean playing;
    private boolean on;
    
    
    // Special methods "Constructor", "Setters" and "Getters".
    public RemoteControl() {
        volume = 50;
        playing = false;
        on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    
    
    
    
    
}
