package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.App;
import at.ac.fhcampuswien.AppController;
import at.ac.fhcampuswien.Article;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getAllBitcoinNewsTest {
    //test

    @Test
    public void getAllBitcoinNewsTest1() {
        List<Article> mock = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(three);
        Article four = new Article("Dr.Acula", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(four);
        Article five = new Article("five", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(five);
        Article six = new Article("six", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock.add(twelve);

        String b = "Bitcoin";
        List<Article> filtered = AppController.filterList(b, mock) ;
        List<Article> bitcoin = new ArrayList<>();
        bitcoin.add(one);
        bitcoin.add(two);
        bitcoin.add(three);
        bitcoin.add(four);
        bitcoin.add(five);
        bitcoin.add(six);
        bitcoin.add(seven);
        bitcoin.add(eight);
        bitcoin.add(nine);
        bitcoin.add(ten);
        bitcoin.add(eleven);
        bitcoin.add(twelve);


        assertEquals(filtered, bitcoin);

        //String actual = "Bitcoin";
        //assertEquals(actual.contains("Bitcoin"), five.getTitle().contains("Bitcoin"));

        //if (two.equals(actual)){System.out.println("Bitcoin found!");}else {System.out.println("Not Bitcoin found!");}

        //if (seven.getTitle().equals("Bitcoin")) {System.out.println(true);}

    }
}
