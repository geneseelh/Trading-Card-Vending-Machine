import java.util.*;

public class VendingMachine {

  // new arraylist of items

  private ArrayList<Item> items;

  public VendingMachine() {
    this.items = new ArrayList<Item>();
  }

  public int size() {
    return this.items.size();
  }

  // methods

  public void add(Item item) {
    this.items.add(item);
  }

  public Item get(int index) {
    return this.items.get(index);
  }

  // method to print the full item list & for-loop to iterate through the menu / return item values

  public void printMenu() {
    for (int i = 0; i < items.size(); i ++) {
      Photocard card = (Photocard)items.get(i);
      System.out.println(i + 1 + ")" + " " + items.get(i).getName() + " " + card.getMember());
    }
  }
}
  

