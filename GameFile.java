import java.util.Scanner;
import java.security.PrivateKey;
import java.util.Random;

public class GameFile{
    private String playerName = "";
    private String myWeapon = "Empty";
    private String myArmour = "Empty";
    private String bow = "Bow";
    private String sword = "Sword";
    private String spear = "Spear";
    private String leatherTunic = "Leather Tunic";
    private String leatherLeggings = "Leather Leggings";
    private String leatherHelemet = "Leather Helemet";
    private String leatherBoots = "Leather Boots";
    private String inventory = "Empty";

    private Scanner scan;

    private int hp = 100;
    public static void main(String[]args){
        GameFile game = new GameFile();
        game.playerSetUp();
        game.gameSetup();
        game.wakingUp();
        game.riverCrossing();
        game.oldMan();
    }

    public void playerSetUp(){
        System.out.println("Please enter a username:");
        scan = new Scanner(System.in);
        playerName = scan.nextLine();
        System.out.println("Welcome " + playerName);
        System.out.print("");
        System.out.println("HP: " + hp);
        System.out.print("");
        System.out.println("Armour " + myArmour);
        System.out.print("");
        System.out.println("Weapon " + myWeapon);
        System.out.print("");
        System.out.println("Inventory " + inventory);
        System.out.print("");
        
    }

    public void gameSetup(){
        System.out.println("To play this game you will be questions and then given possible responses\nType the answer you want to take exactly as it is stated in the question otherwise the program will ask you to try again\nThis is still in development and I already apologies if this crashes during your game\nPlease let me know if this crashes, where it crashes and why.");
        
        System.out.println("Welcome, in this game you will go on an adventure\nOn your adventure you will meet things that will help you and things that will try to stop you\nThis adventure is not for the faint of heart\nDo you have what it takes?? (Yes or No)");
        System.out.println("1. Yes\n2. No");
        scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("Alright, let the adventure begin");
        }else if(answer == 2){
            System.out.println("Please Try Again");
        }else{
            System.out.println("Please Try Again");
        }
    }

    public void wakingUp(){
        System.out.println("My eyes open slowly as the light beams into my eyes\nI am surrounded by trees as the birds chirp above me\n(Who am I? or What do I do?)");
        System.out.println("1. Who am I?\n2. What do I do?");
        scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("I have no memory");
        }else if(answer == 2){
            System.out.println("Maybe I should go for a walk and try and find someone");
        }else{
            System.out.println("Please Try Again");
        }
    }

    public void riverCrossing(){
        System.out.println("I come to the end of the forest and I can see path and a river\n(Follow the path)");
        System.out.println("1. Follow the path");
        scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("At the end of the path there is a river\nA boat is on the shore\nI push the boat into the river and jump on\nI sit in this small wooden boat and look at the beautiful mountains in the background\nI hear a rumble in the distance and can see rocks up ahead\nI can see rapids up ahead");
            
            System.out.println("Types (LEFT) or (RIGHT) to steer the boat and avoid the rocks");
            scan = new Scanner(System.in);
            String answer4 = scan.nextLine();
            if(answer4 == "LEFT"){
                System.out.println("");
            }else if(answer4 == "RIGHT"){
                System.out.println("");
                
                System.out.println("Types (LEFT) or (RIGHT)");
                scan = new Scanner(System.in);
                String answer1 = scan.nextLine();
                if(answer1 == "LEFT"){
                    System.out.println("");
                    
                    System.out.println("Types (LEFT) or (RIGHT)");
                    scan = new Scanner(System.in);
                    String answer2 = scan.nextLine();
                    if(answer2 == "LEFT"){
                        System.out.println("");
                        
                        System.out.println("Types (LEFT) or (RIGHT)");
                        scan = new Scanner(System.in);
                        String answer3 = scan.nextLine();
                        if(answer3 == "LEFT"){
                            System.out.println("");
                        }else if(answer3 == "RIGHT"){
                            System.out.println("Congratulations, you have successfully made it out of the rocks\nI paddle the boat to the shore line and get out\nGood to be back on dry land");
                        }else{
                            System.out.println("Please Try Again");
                        }
                    }else if(answer2 == "RIGHT"){
                        System.out.println("");
                    }else{
                        System.out.println("Please Try Again");
                    }
                }else if(answer1 == "RIGHT"){
                    System.out.println("");
                }else{
                    System.out.println("Please Try Again");
                }
            }else{
                System.out.println("Please Try Again");
            }
        }else{
            System.out.println("Please Try Again");
        }
    }

    public void oldMan(){
        System.out.println("You see a house in the distance, and you walk up to it\nKnock of the door\nAn old man opens the door");
        System.out.println("Old Man: 'How can I help?'");
        System.out.println("1. Where am I?");
        System.out.println("2. Who are you?");
        scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("You are in Big Bloke Land");
        }else if(answer == 2){
            System.out.println("My name is Tim\nWho are you?\nI dont know\nWhat can I do around here?");
            System.out.println("There is lots of things to around here, here take this map");
        }else{
            System.out.println("Try Again");
        }

        System.out.println(map insert here);
        System.out.println("Where should we go?\n1. The Town\n2. The desert\n3. The Ocean")
        scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a == 1){
            System.out.println("Good choice");
            shop();
        }else if(a == 2){
            System.out.println("Good choice");
            desert();
        }else if(a == 3){
            System.out.println("Good choice");
            ocean();
        }else{
            System.out.println("Try Again");
        }
    }

    public void shop(){
        System.out.println("You walk inside the shop\nHello, I’m going an adventure into the mountains and I need some warm clothes. The only problem is that I haven’t got any money\nHmmm, well I need some 3 new deer skins to make clothes and if you collect them ill make you your clothes for free. Do you accept?");
        System.out.println("1. Yes\n2. No");
        scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("Awesome, there is a forest not far from here you can go there \nThank you");
            System.out.println("I will need something to catch some deer, what should I use?")
            System.out.println("1. Spear\n2. Bow");
            scan = new Scanner(System.in);
            int a = scan.nextInt();
            if(a == 1){
                System.out.println("Alright, let the adventure begin\nGood choice, although it might be harder to the get close to the deer");
                System.out.println("I head out to the forest");
                System.out.println("After snapping of a solid branch and shaving a point into the end I jump into to watch for a deer to come by.");
                inventory += spear;
                System.out.println("Item accpired " + spear);
                System.out.println("Item has been added to your inventory");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("After a couple hours I have only seen one deer and before I could get close it ran away\nMaybe I should try something else");
            }else if(a == 2){
                System.out.println("Alright, let the adventure begin");
            }else{
                System.out.println("Please Try Again");
            }
        }else if(answer == 2){
            System.out.println("Try Again");
        }else{
            System.out.println("Try Again");
        }
    }

    public void desert(){

    }

    public void ocean(){

    }
}