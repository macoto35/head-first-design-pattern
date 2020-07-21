package gumballState;

public class SoldState extends State {
  private GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void dispense() {
    this.gumballMachine.releaseBall();

    if (this.gumballMachine.getCount() > 0) {
      this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    } else {
      System.out.println("매진입니다!");
      this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
    }
  }
}