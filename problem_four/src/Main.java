import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int formedNumber;

        // Define list
        Integer[] numbers = new Integer[]{50, 2, 1,9};

        // Convert these arrays to lists
        List<Integer> intList = Arrays.asList(numbers);

        formedNumber = calculateFormedNumber(intList);
        System.out.println("Formed Number is : " + formedNumber);

    }

    public static int calculateFormedNumber(List list){

        Collections.sort(list);
        return 10;
    }
}