import java.util.Random;
import java.util.Scanner;

/**
 * This is a texted based game
 * 
 * @author Ben Stacey
 * @author Liam Flynn
 */
public class GameFile {

    protected String playerName = "";

    protected String myWeapon = "Empty";
    protected String myArmour = "Empty";

    protected String bow = "Bow";
    protected String arrow = "Arrow";
    protected String sword = "Sword";
    protected String spear = "Spear";
    protected String trap = "Trap";
    protected String fishingRod = "Fishing Rod";
    protected String axe = "Axe";

    protected String basilisk = "Basilisk";
    protected int basiliskHealth = 10;

    protected String centor = "Centor";
    protected int centorHealth = 10;

    protected String jaguar = "Jaguar";
    protected int jaguarHealth = 10;

    protected String warewolf = "Warewolf";
    protected int warewoldHealth = 10;

    protected String manticore = "Manticore";
    protected int manticoreHealth = 10;

    protected String basiliskSkin = "Basilish Skin";
    protected String centorSkin = "Centor Skin";
    protected String jaguarSkin = "Jaguar Skin";
    protected String warewolfSkin = "Warewolf Skin";
    protected String manticoreSkin = "Manticore Skin";

    protected String leatherTunic = "Leather Tunic";
    protected String leatherLeggings = "Leather Leggings";
    protected String leatherHelemet = "Leather Helemet";
    protected String leatherBoots = "Leather Boots";
    protected String ironHelemet = "Iron Helemet";
    protected String ironChestplate = "Iron Chestplate";
    protected String ironLeggings = "Iron Leggings";
    protected String ironBoots = "iron Boots";
    protected String dragonHelemet = "Dragon Helemet";
    protected String dragonChestplate = "Dragon Chestplate";
    protected String dragonLeggings = "Dragon Leggins";
    protected String dragonBoots = "Dragon Boots";
    protected String hat = "Hat";
    protected String gloves = " Gloves";
    protected String furrPants = "Furr Pants";
    protected String furrJacket = "Furr Jacket";

    protected String water = "Water";
    protected String bread = "Bread";
    protected String meat = "Meat";
    protected String dragonFlesh = "Dragon Flesh";
    protected String doneky = "Donkey";
    protected String penguin = "Penguin";
    protected String meercat = "Meercat";

    protected String inventoryString = "Empty";
    protected String inventoryTemp = "";

    protected String healthPotion = "Health Potion";
    protected String strengthPotion = "Strength Potion";

    protected Scanner scanner = new Scanner(System.in);
    protected Random random;

    protected boolean manticoreCheck = false;
    protected boolean combination = false;

    protected int hp = 100;
    protected int bank = 0;
    protected int inventoryInt = 0;
    protected int inventoryLimit = 10;
    protected int climb = 0;
}