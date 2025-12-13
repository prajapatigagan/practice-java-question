import java.util.List;
import java.util.function.Predicate;//functional interface

public class HigherOrderFunctionsPredicate {
    public static void filterList(List<Integer> numbers, Predicate<Integer> condition) {
        for (Integer number : numbers) {
            if (condition.test(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        filterList(numbers, x -> x % 2 == 0);
    }
}