package at.ac.fhcampuswien;

import java.util.Scanner;

public class Menu {
    private AppController controller = new AppController();
    private static String INVALID_INPUT_MESSAGE = "Please enter a, b, y or q";
    private static String EXIT_MESSAGE = "Bye Bye";

    public void start() {
        Scanner userinput = new Scanner(System.in);

        printMenu();

        String input = userinput.next();
        handleInput(input);
    }

    private void handleInput(String input) {
        if (input.equals("a")) {
            //System.out.println("Austria");
            getTopHeadlinesAustria(controller);
        } else if (input.equals("b")) {
            //System.out.println("Bitcoin");
            getAllNewsBitcoin(controller);
        } else if (input.equals("y")) {
            printArticleCount();
        } else if (input.equals("q")) {
            printExitMessage();
        } else {
            printInvalidInputMessage();
        }
    }

    private void printArticleCount() {
        int count = 0;
        if (controller != null) {
            count = controller.getArticleCount();
        }
        System.out.println("Number of articles: " + count);
    }

    public void getTopHeadlinesAustria(AppController controller) {
        System.out.println(controller.getTopHeadlinesAustria().toString());
    }

    private void getAllNewsBitcoin(AppController controller) {
        //The "getAllNewsBitcoin" Method will be printed out with this line.
        System.out.println(controller.getAllNewsBitcoin().toString());
    }

    private static void printExitMessage() {
        System.out.println(EXIT_MESSAGE);
    }

    private static void printInvalidInputMessage() {
        System.out.println(INVALID_INPUT_MESSAGE);
    }

    private static void printMenu() {
        System.out.println("**************************");
        System.out.println("*   Welcome to Newsapp   *");
        System.out.println("**************************");
        System.out.println("Enter what you wanna do:");
        System.out.println("a: Get top headlines austria");
        System.out.println("b: Get all news about bitcoin");
        System.out.println("y: Count articles");
        System.out.println("q: Quit program");
    }

}
