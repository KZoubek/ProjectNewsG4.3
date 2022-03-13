package at.ac.fhcampuswien;

import java.util.Scanner;

public class Menu {
    private AppController controller = new AppController();
    private static String INVALID_INPUT_MESSAGE = "Please enter a, b, y, q";
    private static String EXIT_MESSAGE = "Bye Bye";

    //in Angabe fehlt static aber sonst kann die Main es nicht ausführen?
    public static void start() {
        printMenu();

        Scanner userinput = new Scanner(System.in);
        String input = userinput.next();

        if (input.equals("a")) {
            System.out.println("Austria");
            //System.out.println(getTopHeadlinesAustria());
        }
        else if (input.equals("b")) {
            System.out.println("Bitcoin");
            //System.out.println(getAllNewsBitcoin());
        }
        else if (input.equals("y")) {
            System.out.println("Count");
            //System.out.println(getArticleCount());
        }
        else if (input.equals("q")) {
            System.out.println(EXIT_MESSAGE);
        } else {
            System.out.println(INVALID_INPUT_MESSAGE);
        }

        /*switch (input) {
            case "a":
                System.out.println("Austria");
                break;
            case "b":
                System.out.println("Bitcoin");
                break;
            case "y":
                System.out.println("Count");
                break;
            case "q":
                System.out.println(EXIT_MESSAGE);
                break;
            default:
                System.out.println(INVALID_INPUT_MESSAGE);
        }*/
        //

    }

    private void handleInput(String input) {

    }

    private void getArticleCount(AppController controller) {

    }

    private void getTopHeadlinesAustria(AppController controller) {

    }

    private void getAllNewsBitcoin(AppController controller) {
    }

    private static void printExitMessage() {

    }

    private static void printInvalidInputMessage() {

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
