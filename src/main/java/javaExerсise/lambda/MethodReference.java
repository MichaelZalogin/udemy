package javaExerсise.lambda;

import java.util.function.Consumer;

public class MethodReference {

    public void applyByInstance() {
        MethodReference methodReference = new MethodReference();
        Consumer<String> consumer = methodReference::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}