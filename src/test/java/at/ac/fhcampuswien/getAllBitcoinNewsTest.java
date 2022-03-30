package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getAllBitcoinNewsTest {

    @Test
    //In this section, a mock list of articles is created.
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

        //String query is created with the word that is being searched for. In this case "Bitcoin".
        String query = "Bitcoin";
        //The list is created so that the query can be used to filter the mock list from above.

        List<Article> filtered = AppController.filterList(query, mock);
        //The object bitcoin is created and is "filled" with the article from above.
        List<Article> bitcoin = new ArrayList<>();
        bitcoin.add(three);
        bitcoin.add(four);
        bitcoin.add(five);
        bitcoin.add(six);
        bitcoin.add(seven);
        bitcoin.add(ten);

        //Here the "filtered" list is compared with the object "bitcoin".
        assertEquals(filtered, bitcoin);
    }
}