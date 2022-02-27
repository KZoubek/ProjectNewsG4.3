package at.ac.fhcampuswien;

public class AppController {
    private List<Article> articles;

    public AppController(List<Article> articles) {
        this.articles = articles;
        // hier SUPER klasse von Articles?
    }

    public void setArticles(List<Article> articles) {

    }

    public int getArticles(){
        //int number = articles.toArray().length;
        return number;
    }

    public List<Article> getTopHeadlinesAustria() {

    }

    public List<Article> getAllNewsBitcoin() {

    }

    protected static List<Article> filterList(String query, List<Article> articles){

    }

    private static List<Article> generateMockList(){

    }

}