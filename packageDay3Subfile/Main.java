package packageDay3Subfile;

import java.util.function.Function;

class MathOperations {
    static int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Using method reference for a static method
        Function<Integer, Integer> squareFunc = MathOperations::square;
        System.out.println(squareFunc.apply(5)); // Output: 25
    }
}
