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
public class Book {
    
    // Book attributes:
    private String title;
    private String author;
    private int totPages;
    private int curPage;
    private boolean open;
    // "Person" is an abstract type of data, it refers to an object of the class "Person".
    // So reader is a person.
    private People reader;
    
    
    // Book custom methods:
    public void details(){
        
    }
    
    
    // Book special methods:

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotPages() {
        return totPages;
    }

    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public boolean getOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public People getReader() {
        return reader;
    }

    public void setReader(People reader) {
        this.reader = reader;
    }
    
    
}
