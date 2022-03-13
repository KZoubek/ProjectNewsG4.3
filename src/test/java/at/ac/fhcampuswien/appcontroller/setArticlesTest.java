package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.AppController;
import at.ac.fhcampuswien.Article;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class setArticlesTest {

    @Test
    public List<Article> setArticles1() {
        //create new object from Appcontroller to call a specific method
        AppController articletest = new AppController();
        articletest.setArticles();

        //Dummy list to have an expected
        List<Article> mock = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(three);
        Article four = new Article("Dr.Acula", "Viertes Buch");
        mock.add(four);
        Article five = new Article("five", "Fünftes Buch");
        mock.add(five);
        Article six = new Article("six", "Sechstes Buch");
        mock.add(six);
        //vivi 7-9
        //mody 10-12
        return mock;

        // compare what we expect vs what we have
        //assertArrayEquals(ArrayList<Article> mock,articletest.setArticles());

    }
}
