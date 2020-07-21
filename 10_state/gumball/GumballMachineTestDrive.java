package gumball;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.ejectQuarter();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.trunCrank();
        gumballMachine.insertQuater();
        gumballMachine.trunCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.insertQuater();
        gumballMachine.trunCrank();
        gumballMachine.trunCrank();
        gumballMachine.insertQuater();
        gumballMachine.trunCrank();
        gumballMachine.insertQuater();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);
    }
}