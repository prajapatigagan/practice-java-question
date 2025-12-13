import java.util.List;
import java.util.function.Consumer;

public class HigherOrderFunctionsConsumer {
    public static void forEachElement(List<Integer> numbers, Consumer<Integer> action) {
        for (Integer number : numbers) {
            action.accept(number);
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        forEachElement(numbers, x -> System.out.print(x + " "));
    }
}