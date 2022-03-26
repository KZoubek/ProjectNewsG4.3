package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private List<Article> articles = generateMockList();

    public AppController() {
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getArticleCount() {
        return articles.size();
    }

    public List<Article> getTopHeadlinesAustria() {

    }

    public List<Article> getAllNewsBitcoin() {

    }

    protected List<Article> filterList(String query, List<Article> articles) {

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
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock.add(nine);
        //mody 10-12
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoinin Booster, Is Talking First Paycheck InCrypto");
        mock.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock.add(twelve);
        return mock;

    }

}
