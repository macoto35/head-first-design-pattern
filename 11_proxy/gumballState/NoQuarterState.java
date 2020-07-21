package gumballState;

public class NoQuarterState extends State {
  private GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("동전을 넣으셨습니다!");
    this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
  }

  public void ejectQuarter() {
    System.out.println("반환 할 동전이 없습니다. 동전을 넣어주세요.");
  }
  
  public void turnCrank() {
    System.out.println("동전을 넣어주세요.");
  }
}