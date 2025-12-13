import java.util.function.IntBinaryOperator;

public class HigherOrderFunctionsReturnValues{

    public static IntBinaryOperator getSumFunction() {
        return (a, b) -> a + b;
    }

    public static void main(String[] args) {
        IntBinaryOperator sumFunction = getSumFunction();
        int result = sumFunction.applyAsInt(5, 10);
        System.out.println(result); // Output: 15
    }
}
