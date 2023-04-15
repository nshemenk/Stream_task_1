import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("List до сортировки:");
        for (int x : intList) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("List после сортировки с использованием Stream API");
        intList.stream()
                .filter(y -> y > 0 && y % 2 == 0)
                .sorted()
                .map(x -> x + " ")
                .collect(Collectors.toList())
                .forEach(System.out::print);
    }
}
