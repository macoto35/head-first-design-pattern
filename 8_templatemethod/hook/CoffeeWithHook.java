package hook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeeWithHook extends CaffineBeverageWithHook  {

    public void brew() {
        System.out.println("필터를 통해서 커피를 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
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
        System.out.print("커피에 우유와 설탕을 넣어 드릴까요? (y/n): ");

        Scanner input = new Scanner(System.in);
        result = input.nextLine();
        
        return result;
    }
}