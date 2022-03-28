package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getTopHeadlineAustriaTest {
    //test
    @Test
    public void getTopHeadlineAustriaTest1(){
        List<Article> articles = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        articles.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        articles.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
        Article four= new Article("Dr.Acula", "Austria is too small for me");
        articles.add(four);
        Article five= new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        articles.add(five);
        Article six= new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        articles.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        articles.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        articles.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        articles.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        articles.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        articles.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        articles.add(twelve);
        // failed test commit
        List<Article> failedArticles = new ArrayList<>();
        Article new_one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        failedArticles.add(one);

        AppController CTRL = new AppController();
        CTRL.setArticles(failedArticles);
        List<Article> actual = CTRL.getTopHeadlinesAustria();
        assertEquals(failedArticles,articles);


    }



}
