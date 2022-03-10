package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private ArrayList<Article> articles = generateMockList(); // for us to test

    public AppController() {
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public int getArticleCount() {

    }

    public ArrayList<Article> getTopHeadlinesAustria() {

    }

    public ArrayList<Article> getAllNewsBitcoin() {

    }

    protected ArrayList<Article> filterList(String query, List<Article> articles) {

    }

    private ArrayList<Article> generateMockList() {
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        articles.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        articles.add(two);
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
        //Julian 4-6
        //vivi 7-9
        //mody 10-12

    }

}
