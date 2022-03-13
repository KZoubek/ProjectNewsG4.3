package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.Article;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class setArticlesTest {

    @Test
    public void setArticles(){
        //create new object
        List<Article> articles = new ArrayList<>();
        int size = articles.size();

        //define where to save data
        size.actual = articles.setArticles();

        // compare what we expect vs what we have actual
        assertEquals(article, actual);

    }
}
