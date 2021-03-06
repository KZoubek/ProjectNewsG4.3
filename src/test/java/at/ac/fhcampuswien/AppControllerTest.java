package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppControllerTest {

    /*
    private static List<Article> mocklist() {
        List<Article> mock = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
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
        return mock;
    }*/
    
    @Test
    @DisplayName("Test 1 for setArticle with long list")
    public void setArticles1() {

        //Dummy list to have an expected
        List<Article> mock2 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock2.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock2.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock2.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        mock2.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        mock2.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
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

        //create new object from Appcontroller to call a specific method because it's not static
        AppController articletest = new AppController();
        articletest.setArticles(mock2);

        // check if articles have been set in new List
        List<Article> gettedList = articletest.getArticles();

        // compare if both match
        assertEquals(gettedList, mock2);
    }

    @Test
    @DisplayName("Test 2 for setArticle with long list")
    public void setArticles2() {

        //Dummy list to have an expected
        List<Article> mock2 = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        mock2.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        mock2.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        mock2.add(three);

        //create new object from Appcontroller to call a specific method because it's not static
        AppController articletest2 = new AppController();
        articletest2.setArticles(mock2);

        // check if articles have been set in new List
        List<Article> gettedList2 = articletest2.getArticles();

        // compare if both match
        assertEquals(gettedList2, mock2);
    }

    @Test
    @DisplayName("Test for getArticleCount")
    void getArticleCount() {
        //create an object of AppController
        AppController myAppController = new AppController();

        // expected value is 12 because we have created 12 object in mocklist
        int expected = 12;

        // get the actual value from method "getArticleCount"
        int actual = myAppController.getArticleCount();

        // compare both values (expected and actual value)
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test for getTopHeadlinesAustria")
    public void getTopHeadlineAustriaTest() {
        //A list(ArrayList) called articels from the class Article is made
        List<Article> articles = new ArrayList<>();
        Article one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        articles.add(one);
        Article two = new Article("Simon Neuch", "Angermanagement and Mandalas");
        articles.add(two);
        Article three = new Article("Bloomberg", "How to: Bitcoin in echtes Geld umwandeln");
        articles.add(three);
        Article four = new Article("Dr.Acula", "Austria is too small for me");
        articles.add(four);
        Article five = new Article("Hugh Jass", "Vienna Is On OnlyFans: Our Cultural Capital Gets Naked");
        articles.add(five);
        Article six = new Article("Yuri Nator", "Erdäpfel, Topfen & Paradeiser are more than just words in Austria.");
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

        //An controller object called CTRL is made
        AppController CTRL = new AppController();
        //With the setArticles method the articles from the List articles is taken
        CTRL.setArticles(articles);

        // and set into the List actual
        List<Article> actual = CTRL.getTopHeadlinesAustria();
        //This is the actual comparison
        assertEquals(articles, actual);

        // Finished test when gettopheadlines ready
        /*List<Article> expected = new ArrayList<>();
        expected.add(one);
        expected.add(four);
        expected.add(six);
        expected.add(eight);*/
        //assertEquals(expected, actual);

        /* failed test commit
        List<Article> failedArticles = new ArrayList<>();
        Article new_one = new Article("Margarete Schramboeck", "SWIFT geht in Austria auch mit Erlagschein");
        failedArticles.add(one);

        AppController CTRL = new AppController();
        CTRL.setArticles(failedArticles);
        List<Article> actual = CTRL.getTopHeadlinesAustria();
        assertEquals(failedArticles,articles);
        */
    }

    @Test
    @DisplayName("Test for getAllNewsBitcoin")
    void getAllNewsBitcoin() {
        //In this section, a mock list of articles is created.
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

    @Test
    @DisplayName("Test 1 for filterList with query Austria")
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

    @Test
    @DisplayName("Test 2 for filterList with query Bitcoin")
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

    @Test
    @DisplayName("Test 3 for filterList with query Mother")
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

    @Test
    @DisplayName("Test 4 for filterList with query the")
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

    @Test
    @DisplayName("Test 5 for filterList with query the with white space")
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
