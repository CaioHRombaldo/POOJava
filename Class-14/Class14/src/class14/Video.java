/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author CaioHRombaldo
 */
public class Video implements VideoActions {
    
    // Video attributes:
    private String title;
    private int assessment;
    private int views;
    private int likes;
    private boolean reproducing;

    
    // VideoActions interface methods:
    @Override
    public void play() {
        this.setReproducing(true);
    }

    @Override
    public void pause() {
        this.setReproducing(false);
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes() + 1);
    }
    
    // Video Override methods:
    @Override
    public String toString() {
        return "Video{" + "title=" + title + 
                ", assessment=" + assessment + 
                ", views=" + views + 
                ", likes=" + likes + 
                ", reproducing=" + reproducing + '}';
    }
    
    
    // Video special methods:
    public Video(String title) {
        this.title = title;
        this.assessment = 1;
        this.likes = 0;
        this.views = 0;
        this.reproducing = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getReproducing() {
        return reproducing;
    }

    public void setReproducing(boolean reproducing) {
        this.reproducing = reproducing;
    }
    
}
