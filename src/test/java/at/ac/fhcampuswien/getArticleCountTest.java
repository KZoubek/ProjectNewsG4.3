package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getArticleCountTest {

    @Test
    public void getArticleCountTest() {

        AppController count = new AppController();

        int expected = 12;
        int actual = count.getArticleCount();

        assertEquals(expected, actual);
    }
    }

