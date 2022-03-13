package at.ac.fhcampuswien.appcontroller;

import org.junit.jupiter.api.Test;


public class setArticlesTest {

    @Test
    public void setArticles1(){
        //create new object from Appcontroller to call a specific method
        AppController articletest = new AppController();
        articletest.setArticles(ArrayList<Article>);

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

        //define where to save data
        size.actual = articles.setArticles();

        // compare what we expect vs what we have actual
        assertEquals(article, actual);

    }
}
