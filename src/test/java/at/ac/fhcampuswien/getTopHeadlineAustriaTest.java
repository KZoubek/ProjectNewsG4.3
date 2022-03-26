package at.ac.fhcampuswien;

import at.ac.fhcampuswien.AppController;
import at.ac.fhcampuswien.Article;
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
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
        //Julian 4-6
        Article four= new Article("Dr.Acula", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
        Article five= new Article("five", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
        Article six= new Article("six", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);

        AppController CTRL = new AppController();
        List actual = CTRL.getTopHeadlinesAustria();
        assertEquals(articles,actual);


    }



}
