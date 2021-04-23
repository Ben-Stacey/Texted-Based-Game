import java.util.Random;
import java.util.Scanner;

/**
 * This is a texted based game
* @author Ben Stacey
* @author Liam Flynn
 */
public class gameStartup{
    private String playerName = "";

    private String myWeapon = "Empty";
    private String myArmour = "Empty";

    private String bow = "Bow";
    private String arrow = "Arrow";
    private String sword = "Sword";
    private String spear = "Spear";
    private String trap = "Trap";
    private String fishingRod = "Fishing Rod";
    private String axe = "Axe";

    private String jaguar = "Jaguar";
    private String warewolf = "Warewolf";

    private String jaguarSkin = "Jaguar Skin";
    private String warewolfSkin = "Warewolf Skin";

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
    private String hat = "Hat";
    private String gloves = " Gloves";
    private String furrPants = "Furr Pants";
    private String furrJacket = "Furr Jacket";

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
        Shop game = new Shop();
        game.playerSetUp();
        gameSetup();
        wakingUp();
        riverCrossing();
        oldMan();
    }

    /** 
     * playSetup() method
     * This method has all the information about setting up your character
     * Allows you to choose your player name
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
        System.out.println("Inventory " + inventoryString);
        System.out.println("");    
    }

    /** 
     * gameSetup() method
     * This method allows the player to setup the game and gives them a brief about how the game works
     */ 

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

    /**
     * wakingUp() method
     * Start of the game, your character wakes up
     */
    public void wakingUp(){
        System.out.println("My eyes open slowly as the light beams into my eyes\nI am surrounded by trees as the birds chirp above me\n(Who am I? or What do I do?)");
        System.out.println("1. Who am I?\n2. What do I do?");
        scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println(playerName);
        }else if(answer == 2){
            System.out.println("Maybe I should go for a walk and try and find someone");
        }else{
            System.out.println("Please Try Again");
        }
    }

    /**
     * riverCrossing() method
     * This method has the player travelling down a river
     * The player must type left and right to navigate there way down the river
     * Failure will result in the player having to do that again
     */
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

    /**
     * oldMan() method
     * This method is where the main part of the story starts 
     * You meet an old man and he gives a map
    * The player then decides how they want to play the story
    */
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

    /**
     * shop() method
     * The shop method intoduces the player in to the purchasing system in the game
     * You can do challenged for the shop keeper which will earn you moeny
     */
    public void shop(){
        System.out.println("You walk inside the shop\nHello, I’m going an adventure into the mountains and I need some warm clothes. The only problem is that I haven’t got any money\nHmmm, well I need some 3 new deer skins to make clothes and if you collect them ill make you your clothes for free. Do you accept?");
        hunting();
    }

    /**
     * desert() method
     * Takes the user to the desert 
     */
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

    /**
     * ocean() method
     * Takes the player to the ocean
     */
    public void ocean(){
        System.out.println("Your swimming ability isn’t great, head to the closest town and find boat\nAfter a long walk you come to a small village, you go to the port and find a fisherman");
        System.out.println("Hello, can I get a ride on your boat?\nWhy do u want to a ride?\nI am going on an adventure across the ocean\nNo u don’t want to go there, the ocean is harsh and dangerous place\nIf it is an adventure your looking you should go to the mountains");
    }

    /**
     * mountain() method
     * Takes the player to the mountains
     */
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
        System.out.println("I would not even think about heading into those mountains without a sword\nThere is a blacksmith in town he can make you a sword\nBut I don’t have any money\nThen you should go talk to the mayor he has some tasks that he will pay you to do\nYou walk into the town hall and see the mayor");
        mayor();
    }
        
    /**
     * randomTask()
     * This is called in the mayor class, when called randomly picks
     * the task you can do
     */
    public void randomTask(){
        Random rand = new Random();
        int r = rand.nextInt(2);
        if(r == 0){
            fishing();
        }else if(r == 1){
            hunting();
        }else if(r == 2){
            logging();
        }
    }

    /**
     * mayor() method
     * The mayor gives out job which can get you money
     */
    public void mayor(){
        print("Hello, I am the mayor. I can give you tasks that you can complete for money\nWould you like to do a challenge?");
        print("1. Yes\n2. No");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        if(s == 1){
            print("Awsesome!");
            randomTask();
        }else if(s == 2){
            print("Try Again");
        }else{
            print("Try Again");
        }
    }

    /**
     * fishing() method
     * Fishing is a method that allows you to get money
     */
    public void fishing(){
        print("Awesome, we need some more fish for the village\nhere is a river not far from here full of fish");
        print("...");
        print("...");
        print("...");
        print("After reaching the river I can see there is a few deep pools filled with fish\nNow I need to catch them, how should I catch them?");
        print("1.Fishing Rod\n2. Net\n2. Trap");
        scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        if(s1 == 1){ //Fishing
            print("Tying a few reeds together and then tying it to a stick should make a good fishing rod\nI can use some of the deer meat as bait\nI dangle the bait into the water and wait for something to bite");
            print("...");
            print("...");
            print("...");
            print("FISH ON!!!\nI yell as the rod is nearly yanked out of my hand\nI quickly pull on the rod and pull the fish in\nI do this for a few hours to get enough fish for the mayor");
            print("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            bank += 500;
        }else if(s1 == 2){ //Net
            print("I find some reeds by the side of the river\nI start to weave them together to make a net\nI throw the net into the river and pull it back in to see what I get");
            print("...");
            print("...");
            print("...");
            print("Nothing\nI keep trying again it does work great, but I eventually get enough");// This text needs to be edited as it boring the same should be added into the trap below
            print("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500"); //value should be different depending on what is caught
            bank += 500;
        }else if(s1 == 3){ // Trap
            print("I pile rocks up below the deep pool in the river to make a small dam\nI grab some reeds from the side of the river and weave it into a little basket and place it In the middle of the dam\nI then walk to the top of the deep pool and thrash about to make lots of noise and scare the fish into the basket\nI check the basket and it is full of fish");
            print("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            bank += 500;
        }else{
            print("Try Again");
        }
    }

    /**
     * skin() method
     * skinng an animal method
     * This needs to be changed from jaguar skin to work with any animal 
     */
    public void skin(){
        print("Do you want to skin the " + jaguar + "?");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        print("1.Yes\n2. No");
        if(s == 1){
            print("Nice, you acquired a " + jaguar + " skin\nSell back at the town for money");
            inventoryString += jaguarSkin;
        }else if(s == 2){
            print("Ok, maybe next time"); 
        }else{
            print("Try Again");
        }
    }

    /**
     * jaguar() method
     * jaguar hitting sequence in this method
     */
    public void jaguar(){
        print("Which weapone should we use?");
        print("1. Bow\n2. Axe");
        scan = new Scanner(System.in);
        s = scan.nextInt();
        if(s == 1){
            //repeat until dead
            health();
            print("The " + jaguar + " is dead!");
            skin();
        }else if(s == 2){
            //repeat until dead
            health();
            print("The " + jaguar + " is dead!");
            skin();
        }else{
            print("Try Again");
        }
    }

    /**
     * logging() method
     * Logging is a method that allows you to get money
     */
    public void logging(){
        print("Awesome, I need you to collect some wood for the new barn we are building\nThere is a forest near by where you can cut some trees down\nBut I don’t have an axe\nHere take this axe ");
        inventoryString += axe;
        print("...");
        print("...");
        print("...");
        print("I arrive at the forest and start to cut down my first tree\n“russel” “russel”\nI turn around as I hear something in the bushes behind me\nA jaguar jumps out of the bush");
		print("Do I want to fight the " + jaguar + " (15HP)");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        print("1. Yes\n2. No");
        if(s == 1){
            jaguar();
            print("I finish off cutting down some and after a few hours of hard work I have dragged all the tree back to the village");
            bank += 500;
            bank();
            beast();
        }else if(s == 2){
            print("Ok\nI finish off cutting down some and after a few hours of hard work I have dragged all the tree back to the village");
            bank += 500;
            bank();
            beast();
        }else{
            print("Try Again");
        }
    }

    /**
     * health() method
     * when called displays current player health
     */
    public void health(){
        print("Your HP is: " + hp);
    }

    /**
     * inventory() method
     * When this method id called the players inventory is displayed
     */
    public void inventory(){
        System.out.println("My inventory has " + inventoryString);
    }
     /**
     * hunting() method
     * Hunting is a method that allows you to get money
     */
    public void hunting(){
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
                inventoryString += spear;
                System.out.println("Item accpired " + spear);
                System.out.println("Item has been added to your inventory");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("After a couple hours I have only seen one deer and before I could get close it ran away\nMaybe I should try something else");
                System.out.println("This will be difficult to make\nI cut a branch off a tree and make some thread from a flaks bush. I strip the flak leave into strips and weave it into a string\nAfter making a few arrows as well I’m ready to go hunting\nI sit up in a tree and a wait for the first deer to come by");
                inventoryString += bow;
                inventoryString += arrow;
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
                             inventoryString += spear;
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
        }else if(answer == 2){
            System.out.println("Try Again");
        }else{
            System.out.println("Try Again");
        }
    }
}

    /**
     * tailor() methos
     * this allows you to sell and make animal skins into clothes or money
     * needs to be changed so any skin is accepted. im thinking of using an arrayList
     */
    public void tailorJaguar(){
        print("Do you want to sell the jaguar skin or take it to the tailor?"); 
        print("1. Sell\n2. Tailor");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        if(s == 1){
            print("Walk into the shop\nI have a jaguar skin to sell u\nAwesome here you go +$250");
            bank += 250;
            bank();
        }else if(s == 2){
            print("Hello traveler\nBack already I see\nYes, I have a jaguar skin would you be able to make me some more clothes\nSure, what kind do u want made?");
            print("1. Hat\n2. Gloves");
            scan = new Scanner(System.in);
            int s1 = scan.nextInt();
            if(s1 == 1){
                print("Ok, thatll be $50\nHere you go");
                bank -= 50;
                bank();
                print("...");
                print("...");
                print("...");
                print("All done, have a nice day");
            }else if(s1 == 2){
                print("Ok, that’ll be $50\nHere you go");
                bank -= 50;
                bank();
                print("...");
                print("...");
                print("...");
                print("All done, have a nice day");
            }else{
                print("Try Again");
            }
        }else{
            print("Try Again");
        }
    }

    /**
     * bank() method
     * Call this method to display the bank balance
     */
    public void bank(){
        System.out.println("Bank balance is: $" + bank);
    }

    /**
     * beast()
     * In this method the fighting the warewolf
     */
    public void beast(){
        print("I went and talked to the mayor\nWe really needed your help\nDo you want to help?\n1. Yes\n2. No");
        scan = new Scanner(System.in);
        int s = scan.nextInt();
        if(s == 1){
            print("Awesome, there has been a beast that has been coming and terrorizes the village on every full moon\nWhat kind of beast?\nIt is a werewolf!\nHow am I going to fight it I don’t have any weapons?\nHere take thig dagger and shield \nThe next full moon is tonight, wait here until nightfall and the beast will appear");
            print("...");
            print("...");
            print("...");
            print("Where should be hide?");
            print("1. Town hall"); //additonal places to be added
            print("Night falls\nI sit quietly and wait\nI see a dark grey figure slowly walk into the town\nI run out into the road and I grab my bow\nI load an arrow and aim at the Werewolf(+15)");
            //put in the fighting mechanic
            print("Yay I have slain the werewolf\nDo you want to skin the werewolf?");
            scan = new Scanner(System.in);
            int s1 = scan.nextInt();
            if(s1 == 1){
                skin();
                print("Good job, You have slain the warewold");
                warewolfTailor();
                print("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
                bank += 500;
                bank();
            }else if(s1 == 2){
                print("Good job, You have slain the warewold");
                print("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
                bank += 500;
                bank();
            }else{
                print("Try Again");
            }
        }else if(s == 2){
            print("Try Again"); 
        }else{
            print("Try Again"); 
        }
    }

    /**
     * warewolfTailor() method
     * method that allows you to get the warewold skin made into things
     * you can also sell it here
     */
    public void warewolfTailer(){
        print("You can sell the skin at the local shop\nWalk into the shop\nI have a werewold\nNice would you like to sell it or craft it into something");
        print("1. Sell\n2. Craft");
        scan  = new Scanner(System.in);
        int s = scan.nextInt();
        if(s == 1){
            print("Thanks, here $500");
            bank += 500;
            bank();
        }else if(s == 2){
            print("What do you want to craft?\n1. Furr Jacket\n2. Furr Pants");
            scan = new Scanner(System.in);
            int s1 = scan.nextInt();
            if(s1 == 1){
                print("Ok, that'll be $50");
                bank -= 50;
                bank();
                print("...");
                print("...");
                print("...");
                print("Here you go, have a nice day");
            }else if(s1 == 2){
                print("Ok, that'll be $50");
                bank -= 50;
                bank();
                print("...");
                print("...");
                print("...");
                print("Here you go, have a nice day");
            }else{
                print("Try Again");
            }
        }else{
            print("Try Again");
        }
    }

    /**
     * blackSmithWareWolf() method
     * 
     */
    public void blackSmithWareWolf(){
        
    }

    /**
     * Got sick of writing System.out.print so created a 
     * method that allows me to jsut type print()
     * @param p is the text being passed
     */
    public void print(String p){
        System.out.println(p);
    }                                                                                                                   
  }
}