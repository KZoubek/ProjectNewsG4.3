package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private List<Article> articles = generateMockList(); // for us to test

    public AppController() {
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getArticleCount() {
        int count=0;
        return count;
    }

    public List<Article> getArticles() {
        return articles;
    }


    public List<Article> getTopHeadlinesAustria() {
        return articles;
    }

    public List<Article> getAllNewsBitcoin() {
        return articles;
    }

    protected static List<Article> filterList(String query, List<Article> articles) {
        // Test 4 fails as "the" is included in "Mother" too
        List<Article> queryList = new ArrayList<>();

        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getTitle().toLowerCase().contains(query.toLowerCase())) {
                queryList.add(articles.get(i));
            }
            // String[] splitTitle = articleTitle.split(" ");?? splittet den Titel nach Wörtern auf
            //muss aber in ein neues Array dann
        }
        return  queryList;
    }

    private static List<Article> generateMockList() {
        List<Article> mock1 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock1.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock1.add(two);
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock1.add(three);
        Article four= new Article("Dr.Acula", "Austria is too small for me");
        mock1.add(four);
        Article five= new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock1.add(five);
        Article six= new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock1.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock1.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock1.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock1.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock1.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock1.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock1.add(twelve);
        Article thirteen = new Article("Lola Free", "Why the is not the same as you might think");
        mock1.add(thirteen);
        return mock1;
    }
}
