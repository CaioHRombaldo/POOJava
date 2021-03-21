/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class15;

/**
 *
 * @author CaioHRombaldo
 */
public class Visualization {
    
    // Visualization attributes:
    private Student viewer;
    private Video movie;
    
    
    // Visualization custom methods:
    public void rate(){
        
    }
    
    public void rate(float score){
        
    }
    
    public void rate(int percentage){
        
    }
    
    
    
    // Visualization special methods:
    public Visualization(Student viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
    }

    public Student getViewer() {
        return viewer;
    }

    public void setViewer(Student viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }
    
    
}
