package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.AppController;
import org.junit.jupiter.api.Test;

public class getArticleCountTest {

    @Test
    public void getArticleCountTest() {

        AppController count = new AppController();

        int expected = 12;
        int actual = count.getArticleCount();

        assertEquals(expected, actual);
    }
    }

