public abstract class Item {

 // instance variables

  private String name;
  private int value;

  // constructor -- default no arg

  public Item() {
  }

  // constructor 2 -- 1 parameter

  public Item(String name) {
    this.name = name;
  }

  // constructor 3 -- 2 parameters

  public Item(String name, int value) {
    this.name = name;
    this.value = value;
  }

  // getters & setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  // method
  
  public String toString() {
    return this.name + ". This Photocard Has A Value Of: $" + this.value + ".";
}
}

  
