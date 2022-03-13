package at.ac.fhcampuswien;

public class Article{

    private String author;
    private String title;

    public Article (String author,String title ){

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    // Override done
    public String toString(){
        return "Author: " + getAuthor() + ", " + "Title: " + getTitle();
    }
}