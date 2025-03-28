import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> returnedList;

        // Define list
        Integer[] numbers = new Integer[]{1, 2, 3};
        Character[] chars = new Character[]{'a', 'b', 'c'};

        // Convert these arrays to lists
        List<Integer> intList = Arrays.asList(numbers);
        List<Character> charList = Arrays.asList(chars);

        returnedList = combineTwoList(charList, intList);
        System.out.println(returnedList);

    }

    // Method for combine two list
    public static List<String> combineTwoList(List listOne, List listTwo) {

        List<String> combinedList = new ArrayList<>();
        int length;

        // Check Length
        if (listOne.size() < listTwo.size()) {
            length = listTwo.size();
        } else {
            length = listOne.size();
        }

        // Combine arrays with for loop
        for (int i = 0; i < length; i++) {
            combinedList.add(listOne.get(i).toString());
            combinedList.add(listTwo.get(i).toString());
        }

        return combinedList;

    }
}