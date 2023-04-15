import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("List до сортировки:");
        for (int x : intList) {
            System.out.print(x + " ");
        }
        System.out.println();

        List<Integer> result = new ArrayList<>();
        for (int x : intList) {
            if (x > 0) {
                if (x % 2 == 0) {
                    result.add(x);
                }
            }
        }
        Collections.sort(result);
        System.out.println("List после сортировки с использованием коллекции:");
        for (int x : result) {
            System.out.print(x + " ");
        }

    }
}