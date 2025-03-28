import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> returnNumberList = new ArrayList<>();
        returnNumberList = checkFabonacciNumbers();

        System.out.println(returnNumberList);
    }

    public static List<String> checkFabonacciNumbers(){
        List<String> numberList = new ArrayList<>();
        int index = 0;
        int firstNumber = 0;
        int secondNumber = 1;

        numberList.add(String.valueOf(firstNumber));

        for (int i = 0; secondNumber <= 100 ; i++) {
            numberList.add(String.valueOf(secondNumber));
            secondNumber += secondNumber;
        }

        return numberList;
    }
}