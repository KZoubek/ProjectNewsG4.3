package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getArticleCountTest {
    //test

    @Test
    public void getArticleCountTest() {
    //create an object of AppController
        AppController myAppController = new AppController();

        // expected value is 12 because we have created 12 object in mocklist
        int expected = 12;

        // get the actual value from method "getArticleCount"
        int actual = myAppController.getArticleCount();

        // compare both values (expected and actual value)
        assertEquals(expected, actual);

    }
}
