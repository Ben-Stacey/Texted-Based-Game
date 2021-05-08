import java.util.Random;
import java.util.Scanner;

public class Desert {
    private GameFile gameFile = new GameFile();
    private boolean status = false;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void p(String s) {
        System.out.println(s);
    }

    public void game(){
        p("The desert is hot and dry. You might want to find a few water bottles to take some water with you, so you don’t get dehydrated");
        p("After a long walk you come to a small village, you go into a small shop.\nHello, do u have any water bottles?\nYes, How many do you want?\n1. 1\n2. 2");
        int s = scanner.nextInt();
        if (s == 1) {
            p("Ok, that'll be $20\nOh no I don’t have any money\nWell why do u want them\nI am going on an adventure to the desert\nNo u don’t want to go there, you’ll never survive\nIf it is an adventure your looking you should go to the mountains");
        } else if (s == 2) {
            p("Ok, that'll be $20\nOh no I don’t have any money\nWell why do u want them\nI am going on an adventure to the desert\nNo u don’t want to go there, you’ll never survive\nIf it is an adventure your looking you should go to the mountains");
        } else {
            p("Try Again");
        }
    }
}
