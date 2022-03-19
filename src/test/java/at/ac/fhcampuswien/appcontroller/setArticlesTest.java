package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.AppController;
import at.ac.fhcampuswien.Article;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class setArticlesTest {
    private List<Article> articles;

    @Test
    public List<Article> setArticles1() {
        //create new object from Appcontroller to call a specific method
        AppController articletest = new AppController();
        articletest.getMock1();

        List<Article> articleArray = new ArrayList<>();
        articleArray.contains(articletest);

        //Dummy list to have an expected
        List<Article> mock2 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock2.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock2.add(two);
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock2.add(three);
        Article four= new Article("Dr.Acula", "Austria is too small for me");
        mock2.add(four);
        Article five= new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock2.add(five);
        Article six= new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock2.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock2.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock2.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock2.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock2.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock2.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock2.add(twelve);
        return mock2;
        // compare what we expect vs what we have
        //assert(ArrayList<Article> mock2, articletest.setArticles());

    }
}
