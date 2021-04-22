public class GameFile{
    int count = 0;
    
    public getIntro(){
      System.out.println("To play this game you will be given questions and possible responses");
      System.out.println("Type the answer you choose and make sure it is exactly as it is stated in the question otherwise the program will ask you to try again");
      System.out.println("This is still in development and I already apologies if this crashes during your game");
      System.out.println("Please let me know if this crashes, where it crashes and why");
      System.out.println();
      System.out.println("Welcome, in this game you will go on an adventure ");
      System.out.println("On your adventure you will meet things that will help you and things that will try to stop you");
      System.out.println("This adventure is not for the faint of heart");
      System.out.println("Do you have what it takes? Yes No");
      Scanner scan = new Scanner(System.in);
      String x = scan.nextLine();
      if(x.equals("Yes")){
        System.out.println("Alright, let the adventure begin");
      }
      else if(x.equals("No")){
        while(x.equals("No")){
          String y = scan.nextLine();//fix the loop
        }
      }
      System.out.println("My eyes open slowly as the light beams into my eyes");
      System.out.println("I am surrounded by trees as the birds chirp above me");
      System.out.println("Choose an option: Who am I? or What do I do?");
      String a = scan.nextLine();
      if(a.equals("Who am I?")){
        System.out.println("I have no memory");
      }
      else if(a.equals("What do I do?")){
        System.out.println("Maybe I should go for a walk and try and find someone");
      }
      System.out.println("I come to the end of the forest and I can see path and a river");
      System.out.println("Choose an option: Follow the path or Head down the river");
      String b = scan.nextLine();
      if(b.equals("Follow the path")){
        System.out.println("");
      }
      else if(b.equals("Head down the river")){//while loop if fail
        System.out.println("I sit in this small wooden boat and look at the beautiful mountains in the background");
        System.out.println("I hear a rumble in the distance and can see rocks up ahead");
        System.out.println("I can see rapids up ahead");
        System.out.println("Type left or right to avoid the rocks. I hope u make it!!!");
        String c = scan.nextLine();
        if(c.equals("Right")){
          String d = scan.nextLine();
          if(d.equals("Left")){
            String e = scan.nextLine();
            if(e.equals("Left")){
              String f = scan.nextLine();
              if(f.equals("Right")){
                System.out.println("Congrats you made it!");
              }
            }
          }
        }
      }
    }
    
    public getTheOldMan(){
      System.out.println("You see a house in the distance, and you walk up to it");
      System.out.println("I knock on the door");
      System.out.println("An old man opens the door");
      System.out.println("How can I help you?");
      System.out.println("Choose an option: Where am I? or Who are you?");
    } 
  }