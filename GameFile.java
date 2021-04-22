import java.util.Scanner;
import java.security.PrivateKey;
import java.util.Random;

public class GameFile{
    private String playerName = "";

    private String myWeapon = "Empty";
    private String myArmour = "Empty";

    private String bow = "Bow";
    private String arrow = "Arrow";
    private String sword = "Sword";
    private String spear = "Spear";
    private String trap = "Trap";
    private String fishingRod = "Fishing Rod";

    private String leatherTunic = "Leather Tunic";
    private String leatherLeggings = "Leather Leggings";
    private String leatherHelemet = "Leather Helemet";
    private String leatherBoots = "Leather Boots";
    private String ironHelemet = "Iron Helemet";
    private String ironChestplate = "Iron Chestplate";
    private String ironLeggings = "Iron Leggings";
    private String ironBoots = "iron Boots";
    private String dragonHelemet = "Dragon Helemet";
    private String dragonChestplate  = "Dragon Chestplate";
    private String dragonLeggings = "Dragon Leggins";
    private String dragonBoots = "Dragon Boots";

    private String water = "Water";
    private String bread = "Bread";
    private String meat = "Meat";
    private String dragonFlesh = "Dragon Flesh";
    private String doneky = "Donkey";
    private String penguin = "Penguin";
    private String meercat = "Meercat";

    private String inventoryString = "Empty";

    private String healthPotion = "Health Potion";
    private String strengthPotion = "Strength Potion";

    private Scanner scan;

    private int hp = 100;
    private int bank = 0;
    private int inventoryInt = 0;
    private int inventoryLimit = 10;

    /** 
     * Starts off the running of the program. 
     * Only need to call the first method and the rest 
     * of the calls re imbedded in the methods so that the 
     * next method works when the correct conditions are met 
     */
    public static void main(String[]args){
        GameFile game = new GameFile();
        game.playerSetUp();
        gameSetup();
        wakingUp();
        riverCrossing();
        oldMan();
    }

    /** 
     * 
     */

    public void playSetup(){
        System.out.println("Please enter a username:");
        scan = new Scanner(System.in);
        playerName = scan.nextLine();
        System.out.println("Welcome " + playerName);
        System.out.println("");
        System.out.println("HP: " + hp);
        System.out.println("");
        System.out.println("Armour " + myArmour);
        System.out.println("");
        System.out.println("Weapon " + myWeapon);
        System.out.println("");
        System.out.println("Inventory " + inventory);
        System.out.println("");
        
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

        System.out.println(); //map insert here, arguments
        System.out.println("Where should we go?\n1. The Town\n2. The desert\n3. The Ocean");
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
        }else if(a == 4){
            System.out.println("Good choice");
            mountain();
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
            System.out.println("I will need something to catch some deer, what should I use?");
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
                System.out.println("This will be difficult to make\nI cut a branch off a tree and make some thread from a flaks bush. I strip the flak leave into strips and weave it into a string\nAfter making a few arrows as well I’m ready to go hunting\nI sit up in a tree and a wait for the first deer to come by");
                inventory += bow;
                inventory += arrow;
                System.out.println("Bow and 3 arrows added to inventory");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("After a while I see a deer, it slowly walks towards me as I take aim and release\nThe deer falls where it stands\nI’m over the moon with exactment \nI sit back in the tree and after a while I get 2 more\nI skin the deer and take some meat for the road and take the skins back to the tailor");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("The tailor makes me my new clothes and sends me on my way\nHere is some money for the left over skin as well");
                //add in about additional money from the deer skins and then u can buy items
                System.out.println("Would like to buy something with your money?");
                System.out.println("1. Yes\n2. No");
                scan = new Scanner(System.in);
                int answer2 = scan.nextInt();
                if(answer2 == 1){
                    System.out.println("Here is what we sell: \n1. Trap");
                    scan = new Scanner(System.in);
                    int b = scan.nextInt();
                    if(b == 1){
                        System.out.println("That will be $10");
                        System.out.println("1. Yes\n2. No");
                        scan = new Scanner(System.in);
                        int c = scan.nextInt();
                        if(c == 1){
                            System.out.println("Purchase Complete");
                            bank += -10;
                            inventory += spear;
                        }else if(c == 2){
                            //System.out.println("Try Again");
                            //bank = -10;
                        }else{
                            System.out.println("Try Again");
                        }
                    }else{
                        System.out.println("Try Again");
                    }
                }else if(answer2 == 2){
                    //other items
                }else{
                    System.out.println("Try Again");
                }
            }else if(a == 2){
                //System.out.println("Alright, let the adventure begin");
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
        System.out.println("The desert is hot and dry. You might want to find a few water bottles to take some water with you, you don’t get dehydrated");
        System.out.println("After a long walk you come to a small village, you go into a small shop.\nHello, do u have any water bottles?\nYes, How many do you want?\n1. 1\n2. 2");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        if(s == 1){
            System.out.println("Ok, that'll be $20\nOh no I don’t have any money\nWell why do u want them\nI am going on an adventure to the desert\nNo u don’t want to go there, you’ll never survive\nIf it is an adventure your looking you should go to the mountains");
        }else if(s == 2){
            System.out.println("Ok, that'll be $20\nOh no I don’t have any money\nWell why do u want them\nI am going on an adventure to the desert\nNo u don’t want to go there, you’ll never survive\nIf it is an adventure your looking you should go to the mountains");
        }else{
            System.out.println("Try Again");
        }
    }

    public void ocean(){
        System.out.println("Your swimming ability isn’t great, head to the closest town and find boat\nAfter a long walk you come to a small village, you go to the port and find a fisherman");
        System.out.println("Hello, can I get a ride on your boat?\nWhy do u want to a ride?\nI am going on an adventure across the ocean\nNo u don’t want to go there, the ocean is harsh and dangerous place\nIf it is an adventure your looking you should go to the mountains");
    }

    public void mountain(){
        System.out.println("I see the same man standing a few doors down and go talk to him\nI tell him how I am on an adventure into the mountains and ask him is there is anything I may need before I go there\nHe looks at me with a terrifying look\nYou know what’s in those mountains, don’t you?");
        System.out.println("1. Yes\n2. No");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        if(s == 1){
            System.out.println("Yes, but do have anything else to tell me about it?\nThere are dangerous beasts that live in those mountains \nI even hear there is a dragon that protects the highest peak\nNo man has ever come out of there alive");
        }else if(s == 2){
            System.out.println("There are dangerous beasts that live in those mountains \nI even hear there is a dragon that protects the highest peak\nNo man has ever come out of there alive");
        }else{
            System.out.println("Try Again");
        }


    }

    /** 
    public void System.out.println(String p){
        System.out.println(p);
    }
    */
}