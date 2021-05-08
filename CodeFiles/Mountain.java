import java.util.Random;
import java.util.Scanner;

public class Mountain {
    private GameFile gameFile = new GameFile();
    private boolean status = false;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void p(String s) {
        System.out.println(s);
    }

    public void game(){
        p("I see the same man standing a few doors down and go talk to him\nI tell him how I am on an adventure into the mountains and ask him is there is anything I may need before I go there\nHe looks at me with a terrifying look\nYou know what’s in those mountains, don’t you?");
        p("1. Yes\n2. No");
        int s = scanner.nextInt();
        if (s == 1) {
            p("Yes, but do have anything else to tell me about it?\nThere are dangerous beasts that live in those mountains \nI even hear there is a dragon that protects the highest peak\nNo man has ever come out of there alive");
        } else if (s == 2) {
            p("There are dangerous beasts that live in those mountains \nI even hear there is a dragon that protects the highest peak\nNo man has ever come out of there alive");
        } else {
            p("Try Again");
        }
        p("I would not even think about heading into those mountains without a sword\nThere is a blacksmith in town he can make you a sword\nBut I don’t have any money\nThen you should go talk to the mayor he has some tasks that he will pay you to do\nYou walk into the town hall and see the mayor");
    }
}
