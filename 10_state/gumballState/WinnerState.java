package gumballState;

public class WinnerState extends State {
  private GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void dispense() {
    System.out.println("축하합니다! 알맹이를 하나 더 받으실 수 있습니다!");
    this.gumballMachine.releaseBall();
    this.gumballMachine.releaseBall();

    if (this.gumballMachine.getCount() == 0) {
      System.out.println("매진입니다!");
      this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
    } else {
      this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }
  }
}