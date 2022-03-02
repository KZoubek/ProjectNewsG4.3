package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private ArrayList<Article> articles;

    public AppController() {
        this.articles = articles;
        // hier SUPER klasse von Articles?
    }

    public void setArticles(ArrayList<Article> articles) {

    }

    public int getArticles() {
        int number = articles.toArray().length;
        return number;
    }

    public ArrayList<Article> getTopHeadlinesAustria() {

    }

    public ArrayList<Article> getAllNewsBitcoin() {

    }

    protected ArrayList<Article> filterList(String query, List<Article> articles) {

    }

    private ArrayList<Article> generateMockList() {
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in AT auch mit Erlagschein");
        articles.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement und Mandalas");
        articles.add(two);
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
    }

}
