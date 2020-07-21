package gumballState;

public abstract class State {
  public void insertQuarter() {
    System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
  }

  public void ejectQuarter() {
    System.out.println("이미 알맹이를 뽑으셨습니다.");
  }
  
  public void turnCrank() {
    System.out.println("손잡이는 한 번만 돌려주세요.");
  }
  
  public void dispense() throws Exception {
    throw new Exception();
  }
}