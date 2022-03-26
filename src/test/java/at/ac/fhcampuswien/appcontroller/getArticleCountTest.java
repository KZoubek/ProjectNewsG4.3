package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.AppController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
