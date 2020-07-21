package gumballState;

public class GumballMachine {
  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;
  private State winnerState;

  private State state = soldOutState;
  private int count = 0;

  public GumballMachine(int numberGumballs) {
    this.soldOutState = new SoldOutState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.hasQuarterState = new HasQuarterState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
     this.state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }
  
  public void turnCrank() {
    try {
      state.turnCrank();
      state.dispense();
    } catch (Exception e) {
      System.out.println("[SYSTEM] dispense() 호출 필요없음!");
    }
  }

  public void setState(State state) {
    this.state = state;
  }

  public void releaseBall() {
    System.out.println("알맹이가 나가고 있습니다...");
    if (this.count != 0) {
      this.count -= 1;
    }
  }

  public State getSoldOutState() {
    return this.soldOutState;
  }

  public State getNoQuarterState() {
    return this.noQuarterState;
  }

  public State getHasQuarterState() {
    return this.hasQuarterState;
  }

  public State getSoldState() {
    return this.soldState;
  }

  public State getWinnerState() {
    return this.winnerState;
  }

  public int getCount() {
    return this.count;
  }

  public void refill(int numberGumballs) {
    System.out.println("알맹이를 " + numberGumballs + "개 리필합니다!");
    this.count += numberGumballs;
    this.state = noQuarterState;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("\n주식회사 왕뽑기\n");
    sb.append("자바로 돌아가는 2004년형 뽑기 기계\n");
    sb.append("남은 개수: " + this.count + "개\n");
    sb.append("동전 투입 대기중\n");

    return sb.toString();
  }
}