public class Photocard extends Item {

 // instance variables

  private String member; // name of person on photocard

// constructor -- 3 parameters

  public Photocard(String name, String member, int value) {
    super(name, value);
    this.member = member;
  }

  // getters & setters

  public String getMember() {
    return member;
  }

  public void setMember(String member) {
    this.member = member;
  }

  // method -- override / polymorphism

  @Override
  public String toString() {
    return member + " From " + super.toString();
  }
}