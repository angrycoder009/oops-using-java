package oops.JavaFeatures;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four");

        // Using lambda expression
        list.forEach(item -> System.out.println(item));

        // Using method reference
        list.forEach(System.out::println);
    }
}
