public class ChocolateBoiler {
    /*// 1. getInstance()를 동기화 시키는 방법: synchronized 추가
    private static ChocolateBoiler chocolateBoilerInstance;
    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoilerInstance == null) {
            chocolateBoilerInstance = new ChocolateBoiler();
        }
        return chocolateBoilerInstance;
    }*/

    /*// 인스턴스를 시작하자마자 만드는 방법
    private static ChocolateBoiler chocolateBoilerInstance = new ChocolateBoiler();
    public static ChocolateBoiler getInstance() {
        return chocolateBoilerInstance;
    }*/

    //DCL(Double-Checking Locking)을 쓰는 방법 
    private volatile static ChocolateBoiler chocolateBoilerInstance;
    public static ChocolateBoiler getInstance() {
        if (chocolateBoilerInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoilerInstance == null) {
                    chocolateBoilerInstance = new ChocolateBoiler();
                }
            }
        }

        return chocolateBoilerInstance;
    }


    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }
    
    public void fill() {
        if (this.isEmpty()) {
            // fill milk and chocolate!
            this.empty = false;
            this.boiled = false;
        }
    }

    public void drain() {
        if (!this.isEmpty() && this.isBoiled()) {
            // move to next stage for boiled milk chocolate
            this.empty = true;
        }
    }

    public void boil() {
        if (!this.isEmpty() && !this.isBoiled()) {
            // boil milk chocolate
            this.boiled = true;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
}