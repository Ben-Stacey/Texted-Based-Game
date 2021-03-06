import java.util.Random;
import java.util.Scanner;

/**
 * This is a texted based game
 * 
 * @author Ben Stacey
 * @author Liam Flynn
 */
public class GameFile {
    private String playerName = "";

    private String myWeapon = "Empty";
    private String myArmour = "Empty";
    private int myHealth = 100;

    private String bow = "Bow";
    private String arrow = "Arrow";
    private String sword = "Sword";
    private String spear = "Spear";
    private String trap = "Trap";
    private String fishingRod = "Fishing Rod";
    private String axe = "Axe";

    private String basilisk = "Basilisk";
    private int basiliskHealth = 100;

    private String centor = "Centor";
    private int centorHealth = 100;

    private String troll = "troll";
    private int trollHealth = 100;

    private String jaguar = "Jaguar";
    private int jaguarHealth = 100;

    private String warewolf = "Warewolf";
    private int warewolfHealth = 100;

    private String manticore = "Manticore";
    private int manticoreHealth = 100;

    private String basiliskSkin = "Basilish Skin";
    private String trollSkin = "Troll Skin";
    private String centorSkin = "Centor Skin";
    private String jaguarSkin = "Jaguar Skin";
    private String warewolfSkin = "Warewolf Skin";
    private String manticoreSkin = "Manticore Skin";

    private String leatherTunic = "Leather Tunic";
    private String leatherLeggings = "Leather Leggings";
    private String leatherHelemet = "Leather Helemet";
    private String leatherBoots = "Leather Boots";
    private String ironHelemet = "Iron Helemet";
    private String ironChestplate = "Iron Chestplate";
    private String ironLeggings = "Iron Leggings";
    private String ironBoots = "iron Boots";
    private String dragonHelemet = "Dragon Helemet";
    private String dragonChestplate = "Dragon Chestplate";
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
    private String inventoryTemp = "";

    private String healthPotion = "Health Potion";
    private String strengthPotion = "Strength Potion";

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private boolean manticoreCheck = false;
    private boolean combination = false;

    private int hp = 100;
    private int bank = 0;
    private int inventoryInt = 0;
    private int inventoryLimit = 10;
    private int climb = 0;
    private int count = 3;
    private String caveCombination = "";

    private boolean hunting = true;
    private boolean fishing = true;
    private boolean logging = true;

    /**
     * Starts off the running of the program. Only need to call the first method and
     * the rest of the calls re imbedded in the methods so that the next method
     * works when the correct conditions are met
     */
    public static void main(String[] args) {
        GameFile game = new GameFile();
        game.playerSetup();
    }

    /**
     * playSetup() method This method has all the information about setting up your
     * character Allows you to choose your player name
     */

    public void playerSetup() {
        gap();
        p("Please enter a username:");
        playerName = scanner.nextLine();
        space();
        p("Welcome " + playerName);
        space();
        p("HP: " + hp);
        space();
        p("Armour: " + myArmour);
        space();
        p("Weapon: " + myWeapon);
        space();
        p("Inventory: " + inventoryString);
        space();
        gameSetup();
    }

    /**
     * gameSetup() method This method allows the player to setup the game and gives
     * them a brief about how the game works
     */

    public void gameSetup() {
        p("To play this game you will be asked questions and then given possible responses\nType the answer you want to take exactly as it is stated in the question otherwise the program will ask you to try again\nThis is still in development and I already apologise if this crashes during your game\nPlease let me know if this crashes, where it crashes and why.");
        p("Welcome, in this game you will go on an adventure\nOn your adventure you will meet things that will help you and things that will try to stop you\nThis adventure is not for the faint of heart");
        space();
        p("Do you have what it takes??");
        space();
        p("1. Yes\n2. No");
        int answer = scanner.nextInt();
        if (answer == 1) {
            wakingUp();
        } else if (answer == 2) {
            p("Please Try Again");
            gameSetup();
        } else {
            p("Please Try Again");
            gameSetup();
        }
    }

    /**
     * wakingUp() method Start of the game, your character wakes up
     */
    public void wakingUp() {
        gap();
        p("Alright, let the adventure begin");
        space();
        p("My eyes open slowly as the light beams into my eyes\nI am surrounded by trees as the birds chirp above me");
        space();
        p("1. Who am I?\n2. What do I do?");
        int answer = scanner.nextInt();
        if (answer == 1) {
            p(playerName);
            wakingUp();
        } else if (answer == 2) {
            space();
            riverSetup();
        } else {
            p("Please Try HelloAgain");
            wakingUp();
        }
    }

    /**
     * riverSetup() method
     * This sets up the scene for travelling down the river
     */
    public void riverSetup(){
        gap();
        p("Maybe I should go for a walk and try and find someone");
        space();
        p("I come to the end of the forest and I can see path and a river");
        p("What should I do?");
        space();
        p("1. Follow the path");
        int answer = scanner.nextInt();
        if (answer == 1) {
            gap();
            p("At the end of the path there is a river\nA boat is on the shore\nI push the boat into the river and jump on\nI sit in this small wooden boat and look at the beautiful mountains in the background\nI hear a rumble in the distance and can see rocks up ahead\nThere are rapids up ahead");
            river(count);
        }else{
            p("Try Again");
            riverSetup();
        }
    }

    /**
     * river() method
     * This is the actual process that is ran recusrivley for the left and right
     * sequence of the boat travelling down the river
     * @param count
     */
    public void river(int count){
        //executes once through the rapids
        if(count == 0){
            gap();
            p("Congratulations, you have successfully made it out of the rocks\nI paddle the boat to the shore line and get out\nGood to be back on dry land");
            oldMan();
            gap();
        }

        //River navigation
        if(count != 0){
            space();
            p("Type (LEFT) or (RIGHT) to steer the boat to avoid the rocks");
            String answer4 = scanner.nextLine();
            if (answer4.equals("LEFT")) {
                space();
                river(count - 1);
            } else if (answer4.equals("RIGHT")) {
                space();
                p("Type (LEFT) or (RIGHT)");
                river(count - 1);
            }//else{
            //    space();
                //p("Try Again");
             //   river(count);
           // }
           river(count);
        }
        gap();
    }

    /**
     * oldMan() method This method is where the main part of the story starts You
     * meet an old man and he gives a map The player then decides how they want to
     * play the story
     */
    public void oldMan() {
        gap();
        p("You see a house in the distance, and you walk up to it\nKnock of the door\nAn old man opens the door");
        space();
        p("Old Man: 'How can I help?'");
        space();
        p("1. Where am I?");
        p("2. Who are you?");
        int answer = scanner.nextInt();
        if (answer == 1) {
            space();
            p("You are in Big Bloke Land");
            oldMan();
        } else if (answer == 2) {
            space();
            p("My name is Tim\nWho are you?");
            space();
            p("I dont know\nWhat can I do around here?");
            space();
            p("There is lots of things to around here, here take this map");
            map();
        } else {
            p("Try Again");
            oldMan();
        }
        gap();
    }

    /**
     * map() method
     * this is what shows all the possible places you can travel too
     */
    public void map(){
        p(""); // map insert here, arguments
        space();
        p("Where should we go?");
        space();
        p("1. The Shop\n2. The Desert\n3. The Ocean\n4. The Mountains");
        int a = scanner.nextInt();
        if (a == 1) {
            space();
            p("Good choice");
            space();
            shop();
        } else if (a == 2) {
            space();
            p("Good choice");
            space();
            desert();
        } else if (a == 3) {
            space();
            p("Good choice");
            space();
            ocean();
        } else if (a == 4) {
            space();
            p("Good choice");
            space();
            mountain();
        } else {
            p("Try Again");
            map();
        }
        gap();
    }

    /**
     * shop() method 
     * The shop method intoduces the player in to the purchasing
     * system in the game You can do challenged for the shop keeper which will earn
     * you moeny
     */
    public void shop() {
        gap();
        p("You walk inside the shop");
        space();
        p("Hello, I???m going an adventure into the mountains and I need some warm clothes. The only problem is that I haven???t got any money");
        space();
        p("Well I have some jobs that'll pay you to do");
        p("Here pick one");
        space();
        p("1. Hunting\n2. Logging\n3. Fishing");
        int answer = scanner.nextInt();
        if(answer == 1 && hunting){
            hunting();
        }else if(answer == 2 && logging){
            logging();
        }else if(answer == 3 && fishing){
            fishing();
        }
        cave();
    }

    /**
     * desert() method 
     * Takes the user to the desert
     */
    public void desert() {
        gap();
        p("You enter the desert and find 20 bucks on the ground, nice.");
        bank += 20;
        p("The desert is hot and dry. You might want to find a few water bottles to take some water with you, so you don???t get dehydrated");
        p("After a long walk you come to a small village, you go into a small shop.");
        space();
        p("Hello, do u have any water bottles?");
        space();
        p("Yes, that'll be $20 a bottle. How many would you like?");
        space();
        p("1. 1/n2. 2");
        space();
        int s = scanner.nextInt();
        if (s == 1) {
            p("Ok, that'll be $20.");
            if (bank < 20){
                space();
                p("Thank you, have a nice day");
                space();
            }
            else{
                space();
                bank -= 20;
                p("Thank you");
                space();
            }
        } else if (s == 2) {
            space();
            p("Ok, that'll be " + 2 * 20);
            if (bank < 40){
                space();
                p("Oh no I don't have enough money!\nI better go back to the map.");
                map();
                space();
            }
            else{
                bank -= 40;
                space();
                p("Thank you.");
                space();
            }
        } else {
            p("Try Again");
            desert();
        }
        space();
        p("How come you're in the desert anyway?");
        space();
        p("I'm going on an adventure!");
        space();
        p("Wow the last time I saw someone go on an adventure into the desert was 20 odd years ago now, a guy named Paul, I would recommend going to the mountains, not the desert.");
        p("What happened to Paul?");
        p("He got munched.\nWhat do you mean he got munched?!\nI mean he got munched.\nBy what?\nA toad.\nA toad?\nYeah it was a pretty big toad.\nOh no good.\nShops closed, bye.\nDo you go to the mountains or further into the desert? \n1. Mountains\n2. Desert");
        int loc = scanner.nextInt();
        if (loc == 1){
            mountain();
        }else if(loc == 2){
            p("Do you head north or south?\n1. North\n2. South");
        }else{
            p("Try again");
            desert();
        }
        int nors = scanner.nextInt();
        if (nors == 1){
            
        }else if(nors == 2){

        }else{
            p("Try again");
            desert();
        }
    }

    /**
     * ocean() method 
     * Takes the player to the ocean
     */
    public void ocean() {
        gap();
        p("Your swimming ability isn???t great, head to the closest town and find boat");
        space();
        p("After a long walk you come to a small village, you go to the port and find a fisherman");
        p("Hello, can I get a ride on your boat?");
        space();
        p("Why do u want to a ride?");
        space();
        p("I am going on an adventure across the ocean\nNo u don???t want to go there, the ocean is harsh and dangerous place\nIf it is an adventure your looking you should go somewhere else");
        map();
    }

    /**
     * mountain() method 
     * Takes the player to the mountains
     */
    public void mountain() {
        gap();
        p("I see the same man standing a few doors down and go talk to him\nI tell him how I am on an adventure into the mountains and ask him is there is anything I may need before I go there\nHe looks at me with a terrifying look");
        space();
        p("You know what???s in those mountains, don???t you?");
        space();
        p("1. Yes\n2. No");
        int s = scanner.nextInt();
        if (s == 1) {
            p("Ok, but do have anything else to tell me about it?");
            space();
            p("There are dangerous beasts that live in those mountains \nI even hear there is a dragon that protects the highest peak\nNo man has ever come out of there alive");
            space();
            p("I think you should go somewhere else");
            map();
        } else if (s == 2) {
            p("There are dangerous beasts that live in those mountains \nI even hear there is a dragon that protects the highest peak\nNo man has ever come out of there alive");
            space();
            p("I think you should go somewhere else");
            map();
        } else {
            p("Try Again");
            mountain();
        }
        p("I would not even think about heading into those mountains without a sword\nThere is a blacksmith in town he can make you a sword\nBut I don???t have any money\nThen you should go talk to the mayor he has some tasks that he will pay you to do\nYou walk into the town hall and see the mayor");
        mayor();
        gap();
    }

    /**
     * randomTask() method
     * This is called in the mayor class, when called randomly picks
     * the task you can do
     */
    public void randomTask() {
        int r = random.nextInt(3);
        if (r == 0 && fishing) {
            fishing();
        } else if (r == 1 && hunting) {
            hunting();
        } else if (r == 2 && logging) {
            logging();
        }
    }

    /**
     * mayor() method 
     * The mayor gives out job which can get you money
     */
    public void mayor() {
        gap();
        p("Hello, I am the mayor. I can give you tasks that you can complete for money\nWould you like to do a challenge?");
        space();
        p("1. Yes\n2. No");
        int s = scanner.nextInt();
        if (s == 1) {
            randomTask();
        } else if (s == 2) {
            p("Try Again");
            mayor();
        } else {
            p("Try Again");
            mayor();
        }
        gap();
    }

    /**
     * fishing() method 
     * Fishing is a method that allows you to get money
     */
    public void fishing() {
        fishing = false;
        gap();
        p("Awesome, we need some more fish for the village\nhere is a river not far from here full of fish");
        p("...");
        p("...");
        p("...");
        p("After reaching the river I can see there is a few deep pools filled with fish\nNow I need to catch them, how should I catch them?");
        space();
        p("1.Fishing Rod\n2. Net\n2. Trap");
        int s1 = scanner.nextInt();
        if (s1 == 1) { // Fishing
            p("Tying a few reeds together and then tying it to a stick should make a good fishing rod\nI can use some of the deer meat as bait\nI dangle the bait into the water and wait for something to bite");
            p("...");
            p("...");
            p("...");
            p("FISH ON!!!\nI yell as the rod is nearly yanked out of my hand\nI quickly pull on the rod and pull the fish in\nI do this for a few hours to get enough fish for the mayor");
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            bank += 500;
        } else if (s1 == 2) { // Net
            p("I find some reeds by the side of the river\nI start to weave them together to make a net\nI throw the net into the river and pull it back in to see what I get");
            p("...");
            p("...");
            p("...");
            p("Nothing\nI keep trying again it does work great, but I eventually get enough");// This text needs to be edited as it boring the same should be added into the trap below
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500"); // value should be different depending on what is caught
            bank += 500;
        } else if (s1 == 3) { // Trap
            p("I pile rocks up below the deep pool in the river to make a small dam\nI grab some reeds from the side of the river and weave it into a little basket and place it In the middle of the dam\nI then walk to the top of the deep pool and thrash about to make lots of noise and scare the fish into the basket\nI check the basket and it is full of fish");
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            bank += 500;
        } else {
            p("Try Again");
            fishing();
        }
        gap();
    }

    /**
     * skin() 
     * skin to work with any animal
     * @param animal is the animal that we are skinning
     */
    public void skin(String animal) {
        space();
        p("Do you want to skin the " + animal + "?");
        int s = scanner.nextInt();
        space();
        p("1.Yes\n2. No");
        if (s == 1) {
            p("Nice, you acquired a " + animal + " skin\nSell back at the town for money");
            if (animal == manticore) {
                inventoryString += manticoreSkin;
            } else if (animal == jaguar) {
                inventoryString += jaguarSkin;
            } else if (animal == warewolf) {
                inventoryString += warewolfSkin;
            }
            //needs to exit back to game somehow
        } else if (s == 2) {
            p("Ok, maybe next time");
            // needs to exit back to game somehow
        } else {
            p("Try Again");
            skin(animal);
        }
        space();
    }

    /**
     * jaguar() method jaguar hitting sequence in this method
     */
    public void jaguar() {
        gap();
        p("Which weapone should we use?");
        space();
        p("1. Bow\n2. Axe");
        int s = scanner.nextInt();
        if (s == 1) {
            jaguarFight(jaguarHealth);
            health();
            p("The " + jaguar + " is dead!");
            skin(jaguar);
        } else if (s == 2) {
            jaguarFight(jaguarHealth);
            health();
            p("The " + jaguar + " is dead!");
            skin(jaguar);
        } else {
            p("Try Again");
            jaguar();
        }
        gap();
    }

    /**
     * jaguarFight() 
     * this method is the fight
     * @param jaguarHealth
     */
    public void jaguarFight(int jaguarHealth){
        gap();
        int jag = 100;
        int hit = random.nextInt(40);
        int damage = jag - hit;
        int attack = random.nextInt(20);
        int self = myHealth - attack;

        p("Type 'ATTACK' to fight the " + jaguar);
        space();
        p("The " + jaguar + "'s health is " + damage);
        space();
        p("Your health is " + self);
        jaguarFight(jaguarHealth - hit);
    }

    /**
     * logging() method Logging is a method that allows you to get money
     */
    public void logging() {
        logging = false;
        gap();
        p("Awesome, I need you to collect some wood for the new barn we are building\nThere is a forest near by where you can cut some trees down");
        space();
        p("But I don???t have an axe");
        space();
        p("Here take this axe ");
        inventoryString += axe;
        p("...");
        p("...");
        p("...");
        p("I arrive at the forest and start to cut down my first tree");
        space();
        p("*Russel* *Russel*");
        space();
        p("I turn around as I hear something in the bushes behind me\nA jaguar jumps out of the bush");
        space();
        p("Do you want to fight the " + jaguar + " (100HP)");
        space();
        p("1. Yes\n2. No");
        int s = scanner.nextInt();
        if (s == 1) {
            jaguar();
            p("I finish off cutting down some and after a few hours of hard work I have dragged all the tree back to the village");
            bank += 500;
            space();
            bank();
            space();
            warewolf();
        } else if (s == 2) {
            p("Ok\nI finish off cutting down some and after a few hours of hard work I have dragged all the tree back to the village");
            bank += 500;
            space();
            bank();
            space();
            warewolf();
        } else {
            p("Try Again");
            logging();
        }
        gap();
    }

    /**
     * health() method when called displays current player health
     */
    public void health() {
        space();
        p("Your HP is: " + hp);
        space();
    }

    /**
     * inventory() method When this method id called the players inventory is
     * displayed
     */
    public void inventory() {
        space();
        p("My inventory has " + inventoryString);
        space();
    }

    /**
     * hunting() method Hunting is a method that allows you to get money
     */
    public void hunting() {
        hunting = false;
        gap();
        p("1. Yes\n2. No");
        space();
        int answer = scanner.nextInt();
        if (answer == 1) {
            gap();
            p("Awesome, there is a forest not far from here you can go there");
            space();
            p("Thank you");
            space();
            p("I will need something to catch some deer, what should I use?");
            gap();
            p("1. Spear\n2. Bow");
            int a = scanner.nextInt();
            if (a == 1) {
                gap();
                p("Good choice, although it might be hard to the get close to the deer");
                p("I head out to the forest");
                p("After snapping of a solid branch and carving the end into a point, I hide in a bush and wait for a deer to come by.");
                inventoryString += spear;
                p("Item accquired " + spear);
                p("Item has been added to your inventory");
                p("...");
                p("...");
                p("...");
                p("After a couple hours I have only seen one deer and before I could get close it ran away\nMaybe I should try something else");
                p("This will be difficult to make\nI cut a branch off a tree and make some thread from a flaks bush. I strip the flak leave into strips and weave it into a string\nAfter making a few arrows as well I???m ready to go hunting\nI sit up in a tree and a wait for the first deer to come by");
                inventoryString += bow;
                inventoryString += arrow;
                p("Bow and 3 arrows added to inventory");
                p("...");
                p("...");
                p("...");
                p("After a while I see a deer, it slowly walks towards me as I take aim and release\nThe deer falls where it stands\nI???m over the moon with exactment \nI sit back in the tree and after a while I get 2 more\nI skin the deer and take some meat for the road and take the skins back to the tailor");
                p("...");
                p("...");
                p("...");
                p("The tailor makes me my new clothes and sends me on my way\nHere is some money for the left over skin as well");
                // add in about additional money from the deer skins and then u can buy items
            } else if(a == 2) {
                // p("Alright, let the adventure begin");
            } else{
                p("Please Try Again");
            }
        } else if (answer == 2) {
            p("Try Again");
            hunting();
        } else {
            p("Try Again");
            hunting();
        }
        gap();
    }

    /**
     * postHuntingPurchasing() method
     * this is what happens after a hunting session has happened
     */
    public void postHuntingPurchasing(){
        gap();
        p("Would like to buy something with your money?");
        gap();
        p("1. Yes\n2. No");
        int answer2 = scanner.nextInt();
        if (answer2 == 1) {
            gap();
            p("Here is what we sell: \n1. Trap");
            gap();
            int b = scanner.nextInt();
            if (b == 1) {
                gap();
                p("That will be $10");
                gap();
                p("1. Yes\n2. No");
                gap();
                int c = scanner.nextInt();
                if (c == 1) {
                    gap();
                    p("Purchase Complete");
                    gap();
                    bank += -10;
                    inventoryString += spear;
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
    }

    /**
     * tailor() methos this allows you to sell and make animal skins into clothes or
     * money needs to be changed so any skin is accepted. im thinking of using an
     * arrayList
     */
    public void tailorJaguar() {
        p("Do you want to sell the jaguar skin or take it to the tailor?");
        p("1. Sell\n2. Tailor");
        int s = scanner.nextInt();
        if (s == 1) {
            p("Walk into the shop\nI have a jaguar skin to sell u\nAwesome here you go +$250");
            bank += 250;
            bank();
        } else if (s == 2) {
            p("Hello traveler\nBack already I see\nYes, I have a jaguar skin would you be able to make me some more clothes\nSure, what kind do u want made?");
            p("1. Hat\n2. Gloves");
            int s1 = scanner.nextInt();
            if (s1 == 1) {
                p("Ok, thatll be $50\nHere you go");
                bank -= 50;
                bank();
                p("...");
                p("...");
                p("...");
                p("All done, have a nice day");
            } else if (s1 == 2) {
                p("Ok, that???ll be $50\nHere you go");
                bank -= 50;
                bank();
                p("...");
                p("...");
                p("...");
                p("All done, have a nice day");
            } else {
                p("Try Again");
            }
        } else {
            p("Try Again");
        }
    }

    /**
     * bank() method Call this method to display the bank balance
     */
    public void bank() {
        p("Bank balance is: $" + bank);
    }

    /**
     * warewolf() In this method the fighting the warewolf
     */
    public void warewolf() {
        gap();
        p("I went and talked to the mayor\nWe really needed your help");
        space();
        p("Do you want to help?");
        space();
        p("1. Yes\n2. No");
        space();
        int s = scanner.nextInt(1);
        if (s == 1) {
            p("Awesome, there has been a beast that has been coming and terrorizes the village on every full moon");
            space();
            p("What kind of beast?");
            space();
            p("It is a werewolf!");
            space();
            p("How am I going to fight it I don???t have any weapons?");
            space();
            p("Here take thig dagger and shield \nThe next full moon is tonight, wait here until nightfall and the beast will appear");
            p("...");
            p("...");
            p("...");
            p("Where should be hide?");
            p("1. Town hall\n2. The Barn\n3. The Mill"); // additonal places to be added
            int r = scanner.nextInt(3);
            if(r == 1 || r == 2 || r == 3){
                warewolfFight(count);
                postWarewolf();
            }
        } else if (s == 2) {
            p("Try Again");
        } else {
            p("Try Again");
        }
    }

    /** 
     * warewolfFight() method
     * this is the method that controls the fight mechanics
     */
    public void warewolfFight(int warewolfHealth){
        gap();
        if(count == 0){
            postWarewolf();;
        }
        p("Night falls\nI sit quietly and wait\nI see a dark grey figure slowly walk into the town\nI grab my bow and run out into the road\nI load an arrow and aim at the Werewolf(+15)");
        gap();
        int war = 100;
        int hit = random.nextInt(40);
        int damage = war - hit;
        int attack = random.nextInt(20);
        int self = myHealth - attack;

        p("Type 'SHOOT' to shoot an arrow at the " + warewolf);
        space();
        p("The " + warewolf + "'s health is " + damage);
        space();
        p("Your health is " + self);
        jaguarFight(warewolfHealth - hit);
    }

    /**
     * postWarewolf() method
     * this is after the fight has been 
     */
    public void postWarewolf(){
        gap();
        p("Yay I have slain the werewolf\nDo you want to skin the werewolf?");
        int s1 = scanner.nextInt();
        if (s1 == 1) {
            skin(warewolf);
            p("Good job, You have slain the warewolf");
            warewolfTailor();
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            bank += 500;
            bank();
        } else if (s1 == 2) {
            p("Good job, You have slain the warewolf");
            p("I went and talked to the mayor\nNice job, we really needed your help\nHere you go +$500");
            bank += 500;
            bank();
        } else {
            p("Try Again");
        }
    }

    /**
     * warewolfTailor() 
     * method method that allows you to get the warewold skin made
     * into things you can also sell it here
     */
    public void warewolfTailor() {
        gap();
        p("You can sell the skin at the local shop\nWalk into the shop\nI have a werewold\nNice would you like to sell it or craft it into something");
        space();
        p("1. Sell\n2. Craft");
        space();
        int s = scanner.nextInt();
        if (s == 1) {
            p("Thanks, here $500");
            bank += 500;
            p("");
        } else if (s == 2) {
            p("What do you want to craft?");
            space();
            p("1. Furr Jacket\n2. Furr Pants");
            space();
            int s1 = scanner.nextInt();
            if (s1 == 1) {
                p("Ok, that'll be $50");
                bank -= 50;
                bank();
                p("...");
                p("...");
                p("...");
                p("Here you go, have a nice day");
            } else if (s1 == 2) {
                p("Ok, that'll be $50");
                bank -= 50;
                bank();
                p("...");
                p("...");
                p("...");
                p("Here you go, have a nice day");
            } else {
                p("Try Again");
            }
        } else {
            p("Try Again");
        }
    }

    /**
     * enterMountain() method 
     * The player decideds that they will travel to the mountains
     */
    public void enterMountain() {
        int r = scanner.nextInt();
        p("Are you ready to go to the mountains?");
        p("1. Yes/n 2. No");
        if (r == 1) {
            p("I set off on the long walk to the mountains");
            p("...");
            p("...");
            p("...");
            p("I pass through lots of villages\nThese places are scary, and everyone looks at me funny\nAs I get closer to the mountains the villages get worse and worse\nAs I get to the bottom of the mountains the suns is blocked by their almighty height\nI can see a gap in-between the mountains \nIt must be pass up into the mountains");
        } else if (r == 2) {
            p("Try Again");
        } else {
            p("Try Again");
        }
    }

    /**
     * combination() 
     * method for solving the cave combination must be correct to enter
     */
    public void combination() {
        p("There is a lock on the cave\nComplete the combination to gain access to the cave");
        p("You must get the answers right to the questions to get inside");
        p("Remeber you answers to make the combination");

        combinationOne();
        combinationTwo();
        combinationThree();

        String s = scanner.nextLine();
        if(s.equals(caveCombination)){
            
        }else{
            combination();
        }
    }

    /**  
     * combinationOne()
     * The first part of the cave combination
     */
    public void combinationOne(){
        int numOne = random.nextInt(10);
        int numTwo = random.nextInt(10);
        int scan = scanner.nextInt();
        int total = numOne * numTwo;
        String totalString = String.valueOf(total);
        caveCombination += totalString;
        p("What is " + numOne + " x " + numTwo +"?");
        if(scan == total){
            p("Good job");
            combinationTwo();
            combination = true;
        }else{
            p("Try Again");
            combination();
        }
    }

    /**  
     * combinationTwo()
     * The second part of the cave combination
     */
    public void combinationTwo(){
        int numOne = random.nextInt(10);
        int numTwo = random.nextInt(10);
        int scan = scanner.nextInt();
        int total = numOne + numTwo;
        String totalString = String.valueOf(total);
        caveCombination += totalString;
        p("What is " + numOne + " + " + numTwo +"?");
        if(scan == total){
            p("Good job");
            combinationThree();
        }else{
            p("Try Again");
            combination();
        }
    }

    /**  
     * combinationThree()
     * The third part of the cave combination
     */
    public void combinationThree(){
        int numOne = random.nextInt(10);
        int numTwo = random.nextInt(10);
        int scan = scanner.nextInt();
        int total = numOne - numTwo;
        String totalString = String.valueOf(total);
        caveCombination += totalString;
        p("What is " + numOne + " - " + numTwo +"?");
        if(scan == total){
            p("Good job");
        }else{
            p("Try Again");
            combination();
        }
    }

    /**
     * cave() method The player comes to a cave: 1st they will need to get a maths
     * problem correct to enter 2nd they will need to nagivate the correct way
     * through the cave If they get it wrong they will knock there head and lose
     * their gear If they get it right they will make it out
     */
    public void cave() {
        combination();
        if (combination == true) {
            p("It is dark inside but there is nowhere else to go\nFind a stick next to the opening of the cave and I tie some animal skin around the top. \nI set it on fire to use as a torch\nAs I enter the cave I can see there is lots of different pathways");
            p("Which way should I go?");
            p("1. Left\n2. Right");
            int r = scanner.nextInt();
            if (r == 1) {
                lostGear();
            } else if (r == 2) {
                p("1. Left\n2. Right");
                int a = scanner.nextInt();
                if (a == 1) {
                    lostGear();
                } else if (a == 2) {
                    p("1. Left\n2. Right");
                    int b = scanner.nextInt();
                    if (b == 1) {
                        p("1. Left\n2. Right");
                        int c = scanner.nextInt();
                        if (c == 1) {
                            manticore();
                            manticoreCheck = true;
                        } else if (c == 2) {
                            lostGear();
                        } else {
                            p("Try Again");
                        }
                    } else if (b == 2) {
                        lostGear();
                    } else {
                        p("Try Again");
                    }
                } else {
                    p("Try Again");
                }
            } else {
                p("Try Again");
            }
        }
    }

    /**
     * manticore() This method defeats the manticore
     */
    public void manticore() {
        if (manticoreCheck == false) {
            p("I come to the end of the path and I can hear a deep rawr\nOut of the shadows a great beast appears\nIt is a manticore");
            p("Which weapon do you want to use?");
            p("1. Sword\n2. Bow");
            int r = scanner.nextInt();
            if (r == 1) {
                p("Swing your sword to kill the " + manticore);
                p("Type = 'Swing' Until it's dead");
                int rand = random.nextInt(4);
                String swing = scanner.nextLine();
                while (manticoreHealth > 0 && swing == "Swing") {
                    manticoreHealth -= rand;
                    p(manticore + " health dropped by: " + rand);
                }
                p("The " + manticore + " has died\nDo you want to skin the " + manticore);
                p("1. Yes\n2. No");
                int a = scanner.nextInt();
                if (a == 1) {
                    skin(manticore);
                } else if (a == 2) {
                    p("Ok");
                } else {
                    p("Try Again");
                }
            } else if (r == 2) {
                p("Use your bow to kill the " + manticore);
                p("Type = 'Draw' Until it's dead");
                int rand = random.nextInt(4);
                String draw = scanner.nextLine();
                while (manticoreHealth > 0 && draw == "Draw") {
                    manticoreHealth -= rand;
                    p(manticore + " health dropped by: " + rand);
                }

                p("The " + manticore + " has died\nDo you want to skin the " + manticore);
                p("1. Yes\n2. No");
                int a = scanner.nextInt();
                if (a == 1) {
                    skin(manticore);
                } else if (a == 2) {
                    p("Ok");
                } else {
                    p("Try Again");
                }
            } else {
                p("Try Again");
            }
        } else if (manticoreCheck == true) {
            p("I come to the end of the path and I can hear a deep rawr\nOut of the shadows a great beast appears\nIt is a manticore");
            p("Which weapon do you want to use?");
            p("1. Sword\n2. Bow");
            int r = scanner.nextInt();
            if (r == 1) {
                p("Swing your sword to kill the " + manticore);
                p("Type = 'Swing' Until it's dead");
                int rand = random.nextInt(4);
                String swing = scanner.nextLine();
                while (manticoreHealth > 0 && swing == "Swing") {
                    manticoreHealth -= rand;
                    p(manticore + " health dropped by: " + rand);
                }
                if (manticoreHealth > 2) {
                    lostGear();
                }

            } else if (r == 2) {
                p("Use your bow to kill the " + manticore);
                p("Type = 'Draw' Until it's dead");
                int rand = random.nextInt(4);
                String draw = scanner.nextLine();
                while (manticoreHealth > 0 && draw == "Draw") {
                    manticoreHealth -= rand;
                    p(manticore + " health dropped by: " + rand);
                }
                if (manticoreHealth > 2) {
                    lostGear();
                }
            } else {
                p("Try Again");
            }
        }
    }

    /**
     * lostGear() This method is acts out the section where the player regains their
     * gear
     */
    public void lostGear() {
        p("Get knocked out\nI keep walking through the cave, and I can see a light \nI must be at the end\nI walk towards and as I am about to exit the cave");
        p("BANG!!!!");
        p("...");
        p("...");
        p("...");
        p("My eyes open slowly and all I see is sky\nI feel dazed and confused\nAll my belongings are missing");
        inventoryTemp = inventoryString;
        inventoryString = "";
        p("Meet the centor and do his quest, get a shield\nAs I walk along the mountain path I keep getting higher and higher\nThe sky is a dark grey as the clouds gather\nUp ahead there is a clearing amongst the clouds as a beam of sun light shines down onto peak\nOn top I can see something sitting up there\nI travel up to this peak and I find a centor\nHello, he says to me\nHello, who are you and what are you doing up here");
        p("My name is Liam I am the Centor that looks after these mountains \nWhat is your name?\nI don???t know but I am on an adventure in these mountains\nEvery time there is an indent in the script it is considered to be an peice of text or context of story that happens within the previously chosen option from the player");
        p("You need to be careful it is dangerous out here\nWhere is your shield?\nShield? I don???t have a shield\nI can get you a shield but I need you to do a task for me, do you accept?");
        p("1. Yes\n2. No");
        int s = scanner.nextInt();
        if (s == 1) {
            p("Awesome, there is a basilisk not far from here that has been attacking people who come into the mountains\nIf you can take him down, I would really appreciate that, can you do it?");
            p("1. Yes");
            p("1. No");
            int sc = scanner.nextInt();
            if (sc == 1) {
                climbing();
                int sc1 = scanner.nextInt();
                if (sc1 == 1) {
                    climbing();
                    int sc2 = scanner.nextInt();
                    if (sc2 == 1) {
                        p("Try Again");
                        climbing();
                    } else if (sc2 == 2) {
                        climbing();
                        int sc3 = scanner.nextInt();
                        if (sc3 == 1) {
                            p("Try Again");
                            climbing();
                        } else if (sc3 == 2) {
                            p("Try Again");
                            climbing();
                        } else {
                            p("Try Again");
                            climbing();
                        }
                    } else {
                        p("Try Again");
                        climbing();
                    }
                } else if (sc1 == 2) {
                    p("Try Again");
                    climbing();
                } else {
                    p("Try Again");
                    climbing();
                }
            } else if (sc == 2) {
                p("Try Again");
                lostGear();
            } else {
                p("Try Again");
                lostGear();
            }
        } else if (s == 2) {
            p("Try Again");
            lostGear();
        } else {
            p("Try Again");
            lostGear();
        }
    }

    /**
     * climbing() method this method is called over and over again to complete the
     * climbing of the rock
     */
    public void climbing() {
        int rand = random.nextInt(1);
        if (climb == 3) {
            p("Good job you made it to the top\nThe " + basilisk + " is really close\nYou pull out your bow");
            baslickFight();
        } else {
            p("Which arm should we move to climb?");
            p("1. Left");
            p("2. Right");
            int scan = scanner.nextInt();
            if (scan == 1) {
                if (rand == 0) {
                    p("Good job");
                    climbing();
                    climb++;
                } else if (rand == 1) {
                    p("You fell");
                    p("Try Again");
                    climbing();
                } else {
                    p("Try Again");
                    climbing();
                }
            } else if (scan == 2) {
                if (rand == 0) {
                    p("Good job");
                    climbing();
                    climb++;
                } else if (rand == 1) {
                    p("You fell");
                    p("Try Again");
                    climbing();
                } else {
                    p("Try Again");
                    climbing();
                }
            } else {
                p("Try Again");
                climbing();
            }
        }
    }

    /**
     * baslickFight() Method is called until the baslick is defeated
     */
    public void baslickFight() {
        if (basiliskHealth > 1) {
            p("You killed the " + basilisk);
            space();
            p("You have got all your gear back");
            troll();
            inventoryString = inventoryTemp;
            inventoryTemp = "";

        } else {
            int r = random.nextInt(10);
            String scan = scanner.nextLine();
            p("Should I shoot close or far?");
            p("1. Close");
            p("2. Far");
            if (scan.equals("Close")) {
                if (r < 5) {
                    p("Hit, -" + r + " damage");
                    basiliskHealth -= r;
                } else if (r > 5) {
                    p("Miss, Try Again");
                    baslickFight();
                }
            } else if (scan.equals("Close")) {
                if (r < 5) {
                    p("Hit, -" + r + " damage");
                    basiliskHealth -= r;
                } else if (r > 5) {
                    p("Miss, Try Again");
                    baslickFight();
                }
            } else {
                p("Try Again");
                baslickFight();
            }
        }
    }

    public void troll() {
        gap();
        p("Im so thristy, I can hear the sound of a crashing waterfall. There must be a river I can get some water from");
        p("On the horizon there is a river flowing\nI start climbing dwown the mountain and bash through the bush towards it");
        p("...");
        p("...");
        p("...");
        p("After coming out of the bush I can see the river\nThe banks are too steap on this side so I'll cross over to get some water");
        p("Luckily there is a bridge here that I can cross");
        p("As I walk down the water I can see a shadow coming from under the bridge");
        p("");
    }

    /** Inserts a gap. */
    public void gap() {
        p("");
        p("--------------------------------------------------------------------------------------------");
        p("");
    }

    public void space(){
        p("");
    }

    /**
     * Prints whatever it is passed.
     * nice
     * @param s String you want printed.
     */
    public void p(String s) {
        System.out.println(s);
    }
}