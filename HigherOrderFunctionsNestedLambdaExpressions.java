import java.util.function.Function;
public class HigherOrderFunctionsNestedLambdaExpressions {
    public static Function<Integer, Function<Integer, Function<Integer, Integer>>> currySum() {
        return a -> b -> c -> a + b + c;
    }
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> curriedSum = currySum();
        int result = curriedSum.apply(1).apply(2).apply(3);
        System.out.println(result);
    }
}
