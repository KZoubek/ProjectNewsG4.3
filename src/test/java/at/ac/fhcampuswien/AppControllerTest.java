package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppControllerTest {

    @Test
    void setArticles() {
    }

    @Test
    void getArticleCount() {
    }

    @Test
    void getTopHeadlinesAustria() {
    }

    @Test
    void getAllNewsBitcoin() {
    }

    @Test //test for "Austria"
    public void filterListTest1() {
        List<Article> mock3 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock3.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock3.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock3.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock3.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock3.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock3.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock3.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock3.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock3.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock3.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock3.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock3.add(twelve);

        // searching for "Austria" in Articles
        String query = "Austria";

        //create a new List where we can store the values
        List<Article> filterListT = AppController.filterList(query, mock3);

        //create a control list for comparing
        List<Article> austria = new ArrayList<>();
        austria.add(one);
        austria.add(four);
        austria.add(six);
        austria.add(eight);

        //compare the two array Lists
        assertEquals(filterListT, austria);
    }

    @Test //test for "Bitcoin"
    public void filterListTest2() {
        List<Article> mock3 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock3.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock3.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock3.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock3.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock3.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock3.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock3.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock3.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock3.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock3.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock3.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock3.add(twelve);

        // searching for "Bitcoin" in Articles
        String query = "Bitcoin";

        //create a new List where we can store the values
        List<Article> filterListT = AppController.filterList(query, mock3);

        //create a control list for comparing
        List<Article> bitcoin = new ArrayList<>();
        bitcoin.add(three);
        bitcoin.add(seven);
        bitcoin.add(ten);
        //compare the two array Lists
        assertEquals(filterListT, bitcoin);
    }

    @Test //test for "mother"
    public void filterListTest3() {
        List<Article> mock3 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock3.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock3.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock3.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock3.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock3.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock3.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock3.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock3.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock3.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock3.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock3.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock3.add(twelve);

        // searching for "Mother" in Articles
        String query = "Mother";

        //create a new List where we can store the values
        List<Article> filterListT = AppController.filterList(query, mock3);

        //create a control list for comparing
        List<Article> mother = new ArrayList<>();
        mother.add(twelve);

        //compare the two array Lists
        assertEquals(filterListT, mother);
    }

    @Test //test for "the"
    public void filterListTest4() {
        List<Article> mock3 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock3.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock3.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock3.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock3.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock3.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock3.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock3.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock3.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock3.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock3.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock3.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock3.add(twelve);
        Article thirteen = new Article("Lola Free", "Why the is not the same as you might think");
        mock3.add(thirteen);

        // searching for "the" in Articles
        String query = "the";

        //create a new List where we can store the values
        List<Article> filterListT = AppController.filterList(query, mock3);

        //create a control list for comparing
        List<Article> the1 = new ArrayList<>();
        the1.add(twelve);
        the1.add(thirteen);

        //compare the two array Lists
        assertEquals(filterListT, the1);
    }

    @Test //test for "the" plus space
    public void filterListTest5() {
        List<Article> mock3 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock3.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock3.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock3.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock3.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock3.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock3.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock3.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock3.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock3.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock3.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock3.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock3.add(twelve);
        Article thirteen = new Article("Lola Free", "Why the is not the same as you might think");
        mock3.add(thirteen);

        // searching for "the" in Articles
        //test fails as "the" is also in "mother" included (Article 12) but not limited
        String query = "the";
        //adding space before and after query
        String query2 = " " + query + " ";

        //create a new List where we can store the values
        List<Article> filterListT = AppController.filterList(query2, mock3);

        //create a control list for comparing
        List<Article> the2 = new ArrayList<>();
        the2.add(thirteen);

        //compare the two array Lists
        assertEquals(filterListT, the2);
    }
    /*
    @Test //test for "the" with CharArray
    public void filterListTest6() {
        List<Article> mock3 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock3.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock3.add(two);
        Article three= new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock3.add(three);
        Article four= new Article("Dr.Acula", "Austria is too small for me");
        mock3.add(four);
        Article five= new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock3.add(five);
        Article six= new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
        mock3.add(six);
        Article seven = new Article("Sova Nova", "Bitcoin soll in Zukunft gedruckt werden");
        mock3.add(seven);
        Article eight = new Article("Sage Smith", "Austria: Das A steht für Alpen");
        mock3.add(eight);
        Article nine = new Article("Raze Rammayer", "Krise: Schokoladen-Verbot in der EU");
        mock3.add(nine);
        Article ten = new Article("New York Times", "Eric Adams, a Bitcoin in Booster, Is Talking First Paycheck InCrypto");
        mock3.add(ten);
        Article eleven = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        mock3.add(eleven);
        Article twelve = new Article("News Sky", "Mother who won 127,000 tells how she still ended up homeless");
        mock3.add(twelve);
        Article thirteen = new Article("Lola Free", "Why the is not the same as you might think");
        mock3.add(thirteen);

        // searching for "the" in Articles
        //test fails as "the" is also in "mother" included (Article 12) but not limited
        String query ="the";
        //convert String in CharArray and check each char seperately


        //create a new List where we can store the values
        List<Article> filterListT = AppController.filterList(query2, mock3);

        //create a control list for comparing
        List<Article> the2 = new ArrayList<>();
        the2.add(thirteen);

        //compare the two array Lists
        assertEquals(filterListT, the2);
    }*/
}
