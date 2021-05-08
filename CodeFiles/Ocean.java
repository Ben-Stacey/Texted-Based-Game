import java.util.Random;
import java.util.Scanner;

public class Ocean {
    private GameFile gameFile = new GameFile();
    private boolean status = false;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void p(String s) {
        System.out.println(s);
    }

    public void game(){
        p("Your swimming ability isn’t great, head to the closest town and find boat\nAfter a long walk you come to a small village, you go to the port and find a fisherman");
        p("Hello, can I get a ride on your boat?\nWhy do u want to a ride?\nI am going on an adventure across the ocean\nNo u don’t want to go there, the ocean is harsh and dangerous place\nIf it is an adventure your looking you should go to the mountains");
    }
}
