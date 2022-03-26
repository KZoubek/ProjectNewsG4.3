package at.ac.fhcampuswien;

import at.ac.fhcampuswien.AppController;
import org.junit.jupiter.api.Test;

public class getArticleCountTest {
    //test

    @Test
    public void getArticleCountTest() {

        AppController myAppController = new AppController();

        int expected = 12;
        int actual = myAppController.getArticleCount();

        assertEquals(expected, actual);

    }
}
