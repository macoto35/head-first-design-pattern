package hook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TeaWithHook extends CaffineBeverageWithHook {

    public void brew() {
        System.out.println("차를 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = this.getUserInput();

        if (answer.toLowerCase().equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String result = "n";
        System.out.print("차에 레몬을 넣어 드릴까요? (y/n): ");

        Scanner input = new Scanner(System.in);
        result = input.nextLine();
        
        return result;
    }
}