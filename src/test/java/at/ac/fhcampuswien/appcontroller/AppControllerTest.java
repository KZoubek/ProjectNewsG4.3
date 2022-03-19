package at.ac.fhcampuswien.appcontroller;

import at.ac.fhcampuswien.AppController;
import at.ac.fhcampuswien.Article;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class AppControllerTest extends AppController {

    private AppController ctrl = new AppController();
    private List<Article> articles;

    @BeforeEach
    void setup(){
        articles = new ArrayList<>();
    }
    //Tests hier alle einfügen

}
