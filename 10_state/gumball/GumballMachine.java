package gumball;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;

        if (this.count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuater() {
        if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
        } else if (state == NO_QUARTER) {
            this.state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
        }
    }

    public void ejectQuarter() {
        if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == HAS_QUARTER) {
            this.state = NO_QUARTER;
            System.out.println("동전이 반환 됩니다.");
        } else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        }       
    }

    public void trunCrank() {
        if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            this.state = SOLD;
            dispense();
        } else if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        }
    }

    public void dispense() {
        if (state == SOLD_OUT) {
            System.out.println("매진입니다.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == HAS_QUARTER) {
            System.out.println("알맹이가 나갈 수 없습니다. 손잡이를 돌려주세요.");
        } else if (state == SOLD) {
            System.out.println("알맹이가 나가고 있습니다.");
            count -= 1;
            if (count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                this.state = SOLD_OUT;
            } else {
                this.state = NO_QUARTER;
            }
        }
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