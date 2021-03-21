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
        this.movie.setAssessment(5);
    }
    
    public void rate(int score){
        int clampScore = 0;
        if (score > 10) {
            clampScore = 10;
        } else if (score < 0) {
            clampScore = 0;
        } else {
            clampScore = score;
        }
        
        this.movie.setAssessment(clampScore);
    }
    
    public void rate(float percentage){
        int tot = 0;
        if (percentage <= 20) {
            tot = 3;
        } else if (percentage <= 50) {
            tot = 5;
        } else if (percentage <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        
        this.movie.setAssessment(tot);
    }
    
    
    // Visualization Override methods:
    @Override
    public String toString() {
        return "-=-=-=-=-=-=-=-=-=-=-=-\n" + "Visualization{" + "viewer=" + viewer.getName() + 
                ", movie=" + movie.getTitle() + '}';
    }
    
    
    // Visualization special methods:
    public Visualization(Student viewer, Video movie) {
        // Here we pass the objects to the variables and update their view counter.
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotWatched(this.viewer.getTotWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
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
