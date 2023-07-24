import java.util.*;

public class Main {

  // create vending machine object
  
  public static VendingMachine vm = new VendingMachine();
  
  public static void main(String[] args) {

    // add photocards to item arraylist

    vm.add(new Photocard("Treasure", "Yoshi", 18));
    vm.add(new Photocard("ATEEZ", "Hongjoong", 25));
    vm.add(new Photocard("The Boyz", "Sunwoo", 18));
    vm.add(new Photocard("Woodz", "Seungyoun", 20));
    vm.add(new Photocard("Le Sserafim", "Chaewon", 32));
    vm.add(new Photocard("NCT", "Shotaro", 21));
    vm.add(new Photocard("P1Harmony", "Keeho", 14));
    vm.add(new Photocard("TXT", "Beomgyu", 19));
    vm.add(new Photocard("Seventeen", "Seungcheol", 16));
    vm.add(new Photocard("Kep1er", "Xiaoting", 30));
    

    // scanner to get user input

    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Welcome To The K-Pop Photocard Machine! You Can Check The Value Of Member Photocards Here!");
    System.out.println();
    
    String userSelection = "";

    // if expression evaluates to true (!), the while statement executes the statement(s) in the while block
    
    while(!userSelection.equals("3")) {
      System.out.println("What Would You Like To Do?\n"
        + "\n1) View The List of K-Pop Photocards\n"
        + "2) Check A Photocard's Value\n"
        + "3) Quit\n");

      userSelection = sc.nextLine();

      // switch statement

      switch(userSelection){
        case "1":
          System.out.println();
          vm.printMenu();
          System.out.println();
          break;
          

        case "2":
          System.out.println();
          vm.printMenu();
          System.out.println();
          getUserSelection(sc);
          System.out.println();
          break;

        case "3":
          System.out.println();
          System.out.println("Goodbye, Thanks For Visiting!");
          return;

        default:
          System.out.println();
          System.out.println("Please Enter A Valid Number Selection [ 1 - 10 ]");
          System.out.println();
      }
    }

    // close scanner
    
    sc.close();
  }

  // Scanner method to retrieve item selection

  private static void getUserSelection(Scanner sc) {
    System.out.println("Enter The Number Of A K-Pop Member From The List:");
    System.out.println();
    int userSelection = -1;

    // try / catch block to check for & handle an exception

    try {
      userSelection = sc.nextInt();
    } catch (Exception e) {
      System.out.println();
      System.out.println("Please Enter A Valid Number Selection [ 1 - 10 ]");
      System.out.println();
      getUserSelection(sc);
      return;
    }

    // if-else statement for photocard selection

    if (userSelection >= 1 && userSelection <= vm.size()) {
      System.out.println("\nLoading Photocard...");
      System.out.println();
      Photocard card = (Photocard) vm.get(userSelection - 1);
      System.out.println("You Have Selected: " + card.toString()); // calling the photocard toString method
      sc.nextLine();
    } else {
      System.out.println();
      System.out.println("Please Enter A Valid Number Selection [ 1 - 10 ]");
      System.out.println();
      getUserSelection(sc);
    } 
    }
  }

  

  


