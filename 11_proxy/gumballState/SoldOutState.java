package gumballState;

public class SoldOutState extends State {
  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("죄송합니다. 매진되었습니다.");
  }

  public void ejectQuarter() {
    System.out.println("죄송합니다. 매진되었습니다.");
  }
  
  public void turnCrank() {
    System.out.println("죄송합니다. 매진되었습니다.");
  }
}