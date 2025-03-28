import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int sum;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        sum = calculateSumWithForLoop(list);
        System.out.println("Sum is : " + sum);

        System.out.println("---------------------------------");

        sum = calculateSumWithWhileLoop(list);
        System.out.println("Sum is : " + sum);
    }

    public static int calculateSumWithForLoop(ArrayList<Integer> arrayList){
        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        return sum;
    }

    public static int calculateSumWithWhileLoop(ArrayList<Integer> arrayList){
        int sum = 0;
        int index = 0;

        while (index < arrayList.size()){
            sum += arrayList.get(index);
            index++;
        }

        return sum;

    }
}