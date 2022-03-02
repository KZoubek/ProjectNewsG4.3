package at.ac.fhcampuswien;

import java.util.List;

public class AppController {
    private List<Article> articles;

    public AppController() {
        this.articles = articles;
        // hier SUPER klasse von Articles?
    }

    public void setArticles(List<Article> articles) {

    }

    public int getArticles() {
        int number = articles.toArray().length;
        return number;
    }

    public List<Article> getTopHeadlinesAustria() {

    }

    public List<Article> getAllNewsBitcoin() {

    }

    protected List<Article> filterList(String query, List<Article> articles) {

    }

    private List<Article> generateMockList() {

    }

}
