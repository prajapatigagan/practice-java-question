import java.util.List;
import java.util.function.Function;
public class CompositionHigherOrderFunctionsAndThen {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> sumSquares = square.andThen(x -> numbers.stream().map(square).reduce(0, Integer::sum));
        int result = sumSquares.apply(5);
        System.out.println(result);
    }
}
