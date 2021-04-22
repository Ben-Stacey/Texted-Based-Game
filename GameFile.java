import java.util.Scanner;
import java.util.Random;

public class GameFile{
    String playerName = "";
    String myWeapon = "Empty";
    String myArmour = "Empty";
    String bow = "Bow";
    String sword = "Sword";
    String leatherTunic = "Leather Tunic";
    String leatherLeggings = "Leather Leggings";
    String leatherHelemet = "Leather Helemet";
    String leatherBoots = "Leather Boots";
    String inventory = "Empty";

    Scanner scan;

    int hp = 100;
    public static void main(String[]args){
        GameFile game = new GameFile();
        game.playerSetUp();
        game.gameSetup();
        game.wakingUp();
        game.riverCrossing();
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
        scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(answer == "Yes"){
            System.out.println("Alright, let the adventure begin");
        }else if(answer == "No"){
            System.out.println("Please Try Again");
        }else{
            System.out.println("Please Try Again");
        }
    }

    public void wakingUp(){
        System.out.println("My eyes open slowly as the light beams into my eyes\nI am surrounded by trees as the birds chirp above me\n(Who am I? or What do I do?)");
        scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(answer == "Who am I?"){
            System.out.println("I have no memory");
        }else if(answer == "What do I do?"){
            System.out.println("Maybe I should go for a walk and try and find someone");
        }else{
            System.out.println("Please Try Again");
    }

    public void riverCrossing(){
        System.out.println("I come to the end of the forest and I can see path and a river\n(Follow the path)");
        scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(answer == "Follow the path"){
            System.out.println("At the end of the path there is a river\nA boat is on the shore\nI push the boat into the river and jump on\nI sit in this small wooden boat and look at the beautiful mountains in the background\nI hear a rumble in the distance and can see rocks up ahead\nI can see rapids up ahead");
            System.out.println("Types (LEFT) or (RIGHT) to steer the boat and avoid the rocks");
            scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if(answer == "LEFT"){
                System.out.println("");
            }else if(answer == "RIGHT"){
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
                        }else if(answer == "RIGHT"){
                            System.out.println("");
                        }else{
                            System.out.println("Please Try Again");
                    }else if(answer == "RIGHT"){
                        System.out.println("");
                    }else{
                        System.out.println("Please Try Again");
                }else if(answer == "RIGHT"){
                    System.out.println("");
                }else{
                    System.out.println("Please Try Again");
            }else{
                System.out.println("Please Try Again");
        }else{
            System.out.println("Please Try Again");
        }
    }

    public void oldMan(){

    }

    public void shop(){

    }

    public void desert(){

    }
  }