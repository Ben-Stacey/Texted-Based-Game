import java.util.Random;
import java.util.Scanner;

public class Mayor {
    private GameFile gameFile = new GameFile();
    private boolean status = false;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void p(String s) {
        System.out.println(s);
    }

    public void game(){
        p("Hello, I am the mayor. I can give you tasks that you can complete for money\nWould you like to do a challenge?");
        p("1. Yes\n2. No");
        int s = scanner.nextInt();
        if (s == 1) {
            p("Awsesome!");
            randomTask();
        } else if (s == 2) {
            p("Try Again");
        } else {
            p("Try Again");
        }
    }

    /**
     * randomTask() This is called in the mayor class, when called randomly picks
     * the task you can do
     */
    public void randomTask() {
        int r = random.nextInt(2);
        if (r == 0) {
            fishing();
        } else if (r == 1) {
            hunting();
        } else if (r == 2) {
            logging();
        }
    }

    /**
     * fishing() method Fishing is a method that allows you to get money
     */
    public void fishing() {
        p("Awesome, we need some more fish for the village\nhere is a river not far from here full of fish");
        p("...");
        p("...");
        p("...");
        p("After reaching the river I can see there is a few deep pools filled with fish\nNow I need to catch them, how should I catch them?");
        p("1.Fishing Rod\n2. Net\n2. Trap");
        int s1 = scanner.nextInt();
        if (s1 == 1) { // Fishing
            p("Tying a few reeds together and then tying it to a stick should make a good fishing rod\nI can use some of the deer meat as bait\nI dangle the bait into the water and wait for something to bite");
            p("...");
            p("...");
            p("...");
            p("FISH ON!!!\nI yell as the rod is nearly yanked out of my hand\nI quickly pull on the rod and pull the fish in\nI do this for a few hours to get enough fish for the mayor");
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            gameFile.bank += 500;
        } else if (s1 == 2) { // Net
            p("I find some reeds by the side of the river\nI start to weave them together to make a net\nI throw the net into the river and pull it back in to see what I get");
            p("...");
            p("...");
            p("...");
            p("Nothing\nI keep trying again it does work great, but I eventually get enough");// This text needs to be
                                                                                              // edited as it boring the
                                                                                              // same should be added
                                                                                              // into the trap below
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500"); // value
                                                                                                          // should be
                                                                                                          // different
                                                                                                          // depending
                                                                                                          // on what is
                                                                                                          // caught
            gameFile.bank += 500;
        } else if (s1 == 3) { // Trap
            p("I pile rocks up below the deep pool in the river to make a small dam\nI grab some reeds from the side of the river and weave it into a little basket and place it In the middle of the dam\nI then walk to the top of the deep pool and thrash about to make lots of noise and scare the fish into the basket\nI check the basket and it is full of fish");
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            gameFile.bank += 500;
        } else {
            p("Try Again");
        }
    }

    /**
     * logging() method Logging is a method that allows you to get money
     */
    public void logging() {
        p("Awesome, I need you to collect some wood for the new barn we are building\nThere is a forest near by where you can cut some trees down\nBut I don’t have an axe\nHere take this axe ");
        gameFile.inventoryString += gameFile.axe;
        p("...");
        p("...");
        p("...");
        p("I arrive at the forest and start to cut down my first tree\n“russel” “russel”\nI turn around as I hear something in the bushes behind me\nA jaguar jumps out of the bush");
        p("Do I want to fight the " + gameFile.jaguar + " (15HP)");
        int s = scanner.nextInt();
        p("1. Yes\n2. No");
        if (s == 1) {
            gameFile.jaguar();
            p("I finish off cutting down some and after a few hours of hard work I have dragged all the tree back to the village");
            gameFile.bank += 500;
            gameFile.bank();
            gameFile.warewolf();
        } else if (s == 2) {
            p("Ok\nI finish off cutting down some and after a few hours of hard work I have dragged all the tree back to the village");
            gameFile.bank += 500;
            gameFile.bank();
            gameFile.warewolf();
        } else {
            p("Try Again");
        }
    }

    /**
     * hunting() method Hunting is a method that allows you to get money
     */
    public void hunting() {
        p("1. Yes\n2. No");
        int answer = scanner.nextInt();
        if (answer == 1) {
            p("Awesome, there is a forest not far from here you can go there \nThank you");
            p("I will need something to catch some deer, what should I use?");
            p("1. Spear\n2. Bow");
            int a = scanner.nextInt();
            if (a == 1) {
                p("Alright, let the adventure begin\nGood choice, although it might be harder to the get close to the deer");
                p("I head out to the forest");
                p("After snapping of a solid branch and shaving a point into the end I jump into to watch for a deer to come by.");
                gameFile.inventoryString += gameFile.spear;
                p("Item accpired " + gameFile.spear);
                p("Item has been added to your inventory");
                p("...");
                p("...");
                p("...");
                p("After a couple hours I have only seen one deer and before I could get close it ran away\nMaybe I should try something else");
                p("This will be difficult to make\nI cut a branch off a tree and make some thread from a flaks bush. I strip the flak leave into strips and weave it into a string\nAfter making a few arrows as well I’m ready to go hunting\nI sit up in a tree and a wait for the first deer to come by");
                gameFile.inventoryString += gameFile.bow;
                gameFile.inventoryString += gameFile.arrow;
                p("Bow and 3 arrows added to inventory");
                p("...");
                p("...");
                p("...");
                p("After a while I see a deer, it slowly walks towards me as I take aim and release\nThe deer falls where it stands\nI’m over the moon with exactment \nI sit back in the tree and after a while I get 2 more\nI skin the deer and take some meat for the road and take the skins back to the tailor");
                p("...");
                p("...");
                p("...");
                p("The tailor makes me my new clothes and sends me on my way\nHere is some money for the left over skin as well");
                // add in about additional money from the deer skins and then u can buy items
                p("Would like to buy something with your money?");
                p("1. Yes\n2. No");
                int answer2 = scanner.nextInt();
                if (answer2 == 1) {
                    p("Here is what we sell: \n1. Trap");
                    int b = scanner.nextInt();
                    if (b == 1) {
                        p("That will be $10");
                        p("1. Yes\n2. No");
                        int c = scanner.nextInt();
                        if (c == 1) {
                            p("Purchase Complete");
                            gameFile.bank += -10;
                            gameFile.inventoryString += gameFile.spear;
                        } else if (c == 2) {
                            // p("Try Again");
                            // bank = -10;
                        } else {
                            p("Try Again");
                        }
                    } else {
                        p("Try Again");
                    }
                } else if (answer2 == 2) {
                    // other items
                } else {
                    p("Try Again");
                }
            } else if (a == 2) {
                // p("Alright, let the adventure begin");
            } else {
                p("Please Try Again");
            }
        } else if (answer == 2) {
            p("Try Again");
        } else {
            p("Try Again");
        }
    }
}
