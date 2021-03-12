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
public class Book implements BookInterface {
    
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
    public String details(){
        return "Book{\n" + "title=" + title + 
                ",\n author=" + author + 
                ",\n totPages=" + totPages + 
                ",\n curPage=" + curPage + 
                ",\n open=" + open + 
                ",\n reader=" + reader.getName() + "\n" +'}';
        
    }
    
    
    // Book abstract methods:
    @Override
    public void open() {
        if (!this.getOpen())
        this.setOpen(true);
    }

    @Override
    public void close() {
        if (this.getOpen())
        this.setOpen(false);
    }

    @Override
    public void flipThrough(int until) {
        if(this.getOpen()) {
            if (until > this.getTotPages()) {
                this.setCurPage(this.getTotPages());
            } else if (until < 0) {
                this.setCurPage(0);
            } else {
                this.setCurPage(until);   
            }
        } else {
            System.out.println("ERROR! First open the book!");
        }
    }

    @Override
    public void nextPage() {
        if(this.getOpen()) {
            if ((this.getCurPage() + 1) > this.getTotPages()) {
                System.out.println("ERROR! No more pages!");
            } else {
                this.setCurPage(this.getCurPage() + 1);
            }
        } else {
            System.out.println("ERROR! First open the book!");
        }
    }

    @Override
    public void backPage() {
        if(this.getOpen()) {
            if ((this.getCurPage() - 1) < 0) {
                System.out.println("ERROR! No more pages!");
            } else {
                this.setCurPage(this.getCurPage() - 1);
            }
        }
    }
    
    
    // Book special methods:
    public Book(String title, String author, int totPages, People reader) {
        this.title = title;
        this.author = author;
        this.totPages = totPages;
        this.curPage = 0;
        this.open = false;
        this.reader = reader;
    }

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
