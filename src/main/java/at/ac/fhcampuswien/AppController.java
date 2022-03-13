package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private List<Article> articles = generateMockList(); // for us to test

    public AppController() {
    }

    public void setArticles() {
        this.articles = articles;
    }

    public int getArticleCount() {
        int count = articles.size();
        return count;
    }

    public List<Article> getTopHeadlinesAustria() {
        return articles;
    }

    public List<Article> getAllNewsBitcoin() {
        return articles;
    }

    protected List<Article> filterList(String query, List<Article> articles) {
        return articles;
    }

    private static List<Article> generateMockList() {
        List<Article> mock = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock.add(two);
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(three);
        Article four= new Article("Dr.Acula", "Viertes Buch");
        mock.add(four);
        Article five= new Article("five", "Fünftes Buch");
        mock.add(five);
        Article six= new Article("six", "Sechstes Buch");
        mock.add(six);
        //vivi 7-9
        //mody 10-12
        return mock;

    }

}
