package gumballState;

import java.util.Random;

public class HasQuarterState extends State {
  Random randomWinner = new Random(System.currentTimeMillis());
  private GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("동전은 한 개만 넣어주세요.");
  }

  public void ejectQuarter() {
    System.out.println("동전이 반환됩니다.");
    this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
  }
  
  public void turnCrank() {
    System.out.println("손잡이를 돌리셨습니다.");

    int winner = randomWinner.nextInt(10);
    if (winner == 0 && (this.gumballMachine.getCount() > 1)) {
      this.gumballMachine.setState(this.gumballMachine.getWinnerState());
    } else {
      this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }
  }
}